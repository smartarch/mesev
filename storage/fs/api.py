import shutil
from datetime import datetime

from flask import Flask, request, Response
from flask_cors import CORS, cross_origin
import logging
logging.basicConfig(level=logging.INFO)

from pathlib import Path
import os

app = Flask(__name__)
cors = CORS(app) # cors is added in advance to allow cors requests
app.config['CORS_HEADERS'] = 'Content-Type'

workspaces_path = Path() / "/workspaces/"


@app.route('/experiments/create/', methods=["PUT"])
@cross_origin()
def create_experiment():

    content = request.json
    if "experiment" not in content:
        return {"message": f"provide experiment in the json, use / to create experiment in subfolder"}, 400

    if "user" not in content:
        return {"message": f"provide user in the json, all lowercase and no space and symbol is allowed"}, 400


    filepath = workspaces_path / content["user"] / "workspace" /  f"{content["experiment"]}.msv"

    if filepath.exists():
        return {"message": f"experiment name {content["experiment"]} already exists"}, 406

    os.makedirs(filepath.parent, exist_ok=True)

    with open(filepath, 'w') as fileobject:
        if "content" in content: 
            fileobject.write(content["content"].get_data(as_text=True))

    return {"message": f"experiment started with name {content["experiment"]}"}, 201


@app.route('/experiments/rename/', methods=["POST"])
@cross_origin()
def rename_experiment():
    content = request.json
    if "old_experiment" not in content:
        return {"message": f"provide old_experiment in the json"}, 400

    if "new_experiment" not in content:
        return {"message": f"provide new_experiment in the json"}, 400


    if "user" not in content:
        return {"message": f"provide user in the json, all lowercase and no space and symbol is allowed"}, 400


    old_file = workspaces_path / content["user"] / "workspace"  /  f"{content["old_experiment"]}.msv"
    new_file = workspaces_path / content["user"] / "workspace"  /  f"{content["new_experiment"]}.msv"

    if not old_file.exists():
        return {"message": f"experiment name {content["old_experiment"]} does not exists"}, 404

    os.makedirs(new_file.parent, exist_ok=True)

    if new_file.exists():
        return {"message": f"experiment name {content["new_experiment"]} already exists"}, 406


    os.rename(old_file, new_file)
    return {"message": f"experiment {content["old_experiment"]} was renamed to {content["new_experiment"]}"}, 200



@app.route('/experiments/delete/', methods=["DELETE"])
@cross_origin()
def delete_experiment():
    content = request.json
    if "experiment" not in content:
        return {"message": f"provide experiment in the json"}, 400

    if "user" not in content:
        return {"message": f"provide user in the json, all lowercase and no space and symbol is allowed"}, 400


    filepath = workspaces_path / content["user"] / "workspace" /  f"{content["experiment"]}.msv"

    if not filepath.exists():
        return {"message": f"experiment name {content["experiment"]} does not exists"}, 404

    # Move and rename the file
    os.remove(filepath)

    return {"message": f"{content["experiment"]} has been deleted"}, 200


@app.route('/experiments/update/', methods=["POST"])
@cross_origin()
def update_experiment():

    content = request.json
    if "experiment" not in content:
        return {"message": f"provide experiment in the json, use / to create experiment in subfolder"}, 400

    if "user" not in content:
        return {"message": f"provide user in the json, all lowercase and no space and symbol is allowed"}, 400


    filepath = workspaces_path / content["user"] / "workspace" /  f"{content["experiment"]}.msv"

    if not filepath.exists():
        return {"message": f"experiment name {content["experiment"]} does not exists"}, 404

    with open(filepath, 'w') as fileobject:
        if "content" in content: 
            fileobject.write(content["content"].get_data(as_text=True))

    return {"message": f"experiment {content["experiment"]} is updated successfully"}, 201



@app.route('/experiments/<user>', methods=["GET"])
@cross_origin()
def get_experiments(user):
    user_workspace = workspaces_path / user
    experiments = [ msv for msv in user_workspace.rglob(f"*.msv") ]
    filenames = "\n".join(str(f.relative_to(user_workspace)) for f in experiments)
    return Response(filenames, mimetype="text/plain")


@app.route('/experiments/<user>/<experiment_full_name>', methods=["GET"])
@cross_origin()
def get_experiment(user, experiment_full_name):
    user_workspace = workspaces_path / user
    filepath = user_workspace / f"{experiment_full_name}.msv"
    if not filepath.exists():
        return {"message": f"experiment name {experiment_full_name} for user {user} does not exist"}, 404

    with open(filepath, "r") as dsl:
        text = dsl.read()

    return Response(text, mimetype="text/plain")


# @app.route('/experiments/dsl2graph/<experiment_name>', methods=["GET"])
# @cross_origin()
# def dsl2graph(experiment_name):
#     filepath = workspace_path / "experiments" / f"{experiment_name}.msv"
#     if not filepath.exists():
#         return {"message": f"experiment name {experiment_name} does not exist"}, 404

#     #TODO: read the DSL and convert it to graph_json
#     graph_json = {}

#     return graph_json, 200


# @app.route('/experiments/graph2dsl/<experiment_name>', methods=["PUT"])
# @cross_origin()
# def graph2dsl(experiment_name):
#     filepath = workspace_path / "experiments" / f"{experiment_name}.msv"
#     if not filepath.exists():
#         #TODO
#         print ("creating ...")

#     else:
#         #TODO
#         print ("updating ...")

#     # TODO: read the json form data, and convert it DSL and store it
#     graph_json = request.json

#     return {"message": "not done yet"}, 201
