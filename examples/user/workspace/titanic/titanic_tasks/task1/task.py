[sys.path.append(os.path.join(os.getcwd(), folder)) for folder in variables.get("dependent_modules_folders").split(",")]
import proactive_helper as ph

print("Running TitanicTask1")

dataset = ph.load_dataset(variables, resultMap, "TitanicTask1InputFile")

demo_param = variables.get("Task1Param")
print(f"with value of demo_param: {demo_param}")

increment = 5
metric_name = "ParamIncreasedBy5"

print(f"Increasing this parameter by {increment} and adding the result to the metric {metric_name}")
resultMap.put(metric_name, int(demo_param) + increment)

ph.save_dataset(variables, resultMap, "TitanicTask1OutputFile", dataset)