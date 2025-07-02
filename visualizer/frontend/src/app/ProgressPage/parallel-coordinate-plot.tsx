import Box from "@mui/material/Box"
import Paper from "@mui/material/Paper"
import { useEffect, useMemo, useRef, useState } from "react"
import Typography from "@mui/material/Typography"
import FormControl from "@mui/material/FormControl"
import DraggableColumns from "./draggable-columns"
import type { SelectChangeEvent } from "@mui/material/Select"
import Select from "@mui/material/Select"
import MenuItem from "@mui/material/MenuItem"
import type { RootState } from "../../store/store"
import { useAppDispatch, useAppSelector } from "../../store/store"
import { setProgressParallel } from "../../store/slices/progressPageSlice"
import _ from "lodash"
import ParallelCoordinateVega from "./parallel-coordinate-vega-plot"
import ReportProblemRoundedIcon from "@mui/icons-material/ReportProblemRounded"

const ParallelCoordinatePlot = () => {
  const { workflows, progressParallel, progressWokflowsTable, progressGauges } =
    useAppSelector((state: RootState) => state.progressPage)
  const [parallelData, setParallelData] = useState<any[]>([])
  const foldArray = useRef<string[]>([])
  const tooltipArray = useRef<{ [key: string]: string }[]>([])
  const [metricExist, setMetricExist] = useState<boolean>(false)

  const dispatch = useAppDispatch()

  useEffect(() => {
    if (workflows.data.length > 0) {
      const uniqueParameters = new Set(
        workflows.data.reduce((acc: any[], workflow) => {
          const params = workflow.tasks.flatMap(task =>
            task.parameters ? task.parameters : [],
          )
          let paramNames = []
          if (params) {
            paramNames = params.map(param => param.name)
            return [...acc, ...paramNames]
          } else {
            return [...acc]
          }
        }, []),
      )
      foldArray.current = Array.from(uniqueParameters)
      const data = workflows.data
        .filter(workflow => workflow.status === "completed")
        .map(workflow => {
          const params = workflow.tasks.flatMap(task =>
            task.parameters ? task.parameters : [],
          )
          return {
            ...Array.from(uniqueParameters).reduce((acc, variant) => {
              acc[variant] =
                params?.find(param => param.name === variant)?.value || ""
              return acc
            }, {}),
            ...(workflow.metrics
              ? workflow.metrics?.reduce((acc, metric) => {
                  return {
                    ...acc,
                    [metric.name]: metric.value,
                  }
                }, {})
              : {}),
            workflowId: workflow.name,
          }
        })
      setParallelData(data)
      let selected = progressParallel.selected
      let options = progressParallel.options
      if (progressParallel.options.length === 0) {
        options = Array.from(
          new Set(
            workflows.data
              // .filter(workflow => workflow.status === "completed")
              .reduce((acc: any[], workflow) => {
                const metrics = workflow.metrics
                  ? workflow.metrics
                      ?.filter(
                        m => m?.semantic_type && m.semantic_type.includes("ML"),
                      )
                      .map((metric: any) => metric.name)
                  : []
                return [...acc, ...metrics]
              }, []),
          ),
        )
        selected = options[0]
      }
      tooltipArray.current = (
        parallelData.at(0) ? Object.keys(parallelData.at(0)) : []
      ).map(key => ({ field: key }))

      const gaugeValue = progressGauges.find(
        gauge => gauge.name === selected,
      )?.value
      setMetricExist(Number.isNaN(gaugeValue) ? false : true)
      dispatch(
        setProgressParallel({
          data,
          options,
          selected,
        }),
      )
    }
  }, [workflows])

  const handleMetricSelection = (event: SelectChangeEvent) => {
    dispatch(setProgressParallel({ selected: event.target.value as string }))
    const gaugeValue = progressGauges.find(
      gauge => gauge.name === (event.target.value as string),
    )?.value
    setMetricExist(!Number.isNaN(gaugeValue))
  }

  const processedData = useMemo(() => {
    return parallelData.map((item, index) => {
      const newItem = { ...item }

      for (const key in newItem) {
        if (Array.isArray(newItem[key])) {
          newItem[key] = newItem[key].join(",")
        }
      }

      newItem.selected = progressWokflowsTable.selectedWorkflows.includes(
        index + 1,
      )
      return newItem
    })
  }, [parallelData, progressWokflowsTable.selectedWorkflows])

  return (
    <>
      <Paper elevation={2}>
        <Box sx={{ display: "flex", alignItems: "center", px: 1.5 }}>
          <Typography fontSize={"0.8rem"}>Color by:</Typography>
          <FormControl
            sx={{ m: 1, minWidth: 120, maxHeight: 120 }}
            size="small"
          >
            <Select
              value={progressParallel.selected}
              sx={{ fontSize: "0.8rem" }}
              onChange={handleMetricSelection}
              disabled={progressParallel.options.length === 0}
              MenuProps={{
                PaperProps: {
                  style: {
                    maxHeight: 250,
                    maxWidth: 300,
                  },
                },
              }}
            >
              {progressParallel.options.map(feature => (
                <MenuItem key={`${feature}`} value={feature}>
                  {feature}
                </MenuItem>
              ))}
            </Select>
          </FormControl>
        </Box>
        <Box sx={{ width: "99%", px: 1 }}>
          <DraggableColumns
            foldArray={foldArray}
            onOrderChange={() => {
              dispatch(setProgressParallel({ ...progressParallel }))
            }}
          />
          {progressParallel.options.length > 0 ? (
            <ParallelCoordinateVega
              parallelData={parallelData}
              progressParallel={progressParallel}
              foldArray={foldArray}
              // map from progressWorkflowsTable.selectedWorkflows id (because it is rows ids) to actual workflowId
              selectedWorkflows={progressWokflowsTable.selectedWorkflows}
              processedData={processedData}
            ></ParallelCoordinateVega>
          ) : (
            <Box
              sx={{
                width: "100%",
                height: 300,
                display: "flex",
                flexDirection: "row",
                alignItems: "center",
                justifyContent: "center",
                columnGap: 1,
              }}
            >
              <ReportProblemRoundedIcon
                sx={{ color: theme => theme.palette.customGrey.dark }}
              />
              <Typography
                variant={"h6"}
                sx={{ color: theme => theme.palette.customGrey.dark }}
              >
                No Metric Data Available
              </Typography>
            </Box>
          )}
        </Box>
      </Paper>
      {/* )} */}
    </>
  )
}

export default ParallelCoordinatePlot
