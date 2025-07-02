# YAMAS
YAMAS: Yet Another Machine Learning Automation System

# 🛠️ YAMAS Platform Setup

This platform is a full development and visualization suite built on Docker Compose. It integrates a language server, editor, file storage, APIs, UI frontends, and backend services—all containerized and connected in a unified environment.

## 🚀 Quick Start

To set up the entire platform, just run:

```bash
docker compose up -d
````

This command builds and launches all services in the background.

## 🌐 Main Access Points

You can access the following UIs and services from your browser:

| Port | Service       | Description                        |
| ---- | ------------- | ---------------------------------- |
| 8000 | Portal        | Web portal main entry point        |
| 8001 | VSCode Server | Web-based IDE with custom DSL      |
| 8002 | Visualizer UI | Frontend for the experiment viewer |

---

## 🧱 Services Overview

### 1. `lang-server`

* **Context:** `./editor/dsl/`
* **Port:** `5007`
* **Purpose:** Custom DSL language server for code analysis/autocompletion in the IDE.
* **Volumes:**

  * `./logs` for server logs
  * `./workspaces` for shared workspace access

---

### 2. `vscode`

* **Context:** `./editor/vscode/`
* **Port:** `8001` (mapped from internal 8080)
* **Environment:**

  * Connects to `lang-server` internally
* **Purpose:** Web-based VSCode IDE with pre-integrated language server

---

### 3. `fs`

* **Context:** `./storage/fs/`
* **Port:** `8005` (mapped from internal 5000)
* **Purpose:** File service backend for handling workspace files
* **Depends On:** `vscode`

---

### 4. `elasticsearch`

* **Image:** `elasticsearch:8.13.0`
* **Port:** `9200`
* **Purpose:** Search and indexing service for data analysis layer (DAL)
* **Volumes:** Persists data in `dal_data` volume

---

### 5. `dal`

* **Context:** `./dal/`
* **Port:** `8004` (mapped from internal 5000)
* **Purpose:** Python (Flask) backend that queries Elasticsearch for data analytics
* **Depends On:** `elasticsearch`
* **Environment:**

  * Connects to Elasticsearch on the Docker network

---

### 6. `vis-api`

* **Context:** `./visualizer/backend/`
* **Port:** `8003` (should be explicitly mapped in your config)
* **Purpose:** Backend for the visualization tool
* **Volumes:**

  * `.env` for environment configs
  * `.output` for storing run outputs
* **Restart Policy:** `unless-stopped`

> **Note:** You may want to explicitly map this port like `"8003:8080"` if needed externally.

---

### 7. `vis-front`

* **Context:** `./visualizer/frontend/`
* **Port:** `8002` (mapped from internal 80)
* **Purpose:** UI for the visualizer, connected to `vis-api`
* **Depends On:** `vis-api`

---

### 8. `mongo`

* **Image:** `mongo:4.4.6`
* **Exposed Port:** `27017` (internal only)
* **Purpose:** Persistent NoSQL database
* **Credentials:**

  * Username: `admin`
  * Password: `admin`

---

### 9. `portal`

* **Context:** `./portal/web-app/`
* **Port:** `8000` (mapped from internal 7001)
* **Purpose:** Public-facing entry to the overall platform

---

## 🗂️ Volumes

| Volume       | Description                       |
| ------------ | --------------------------------- |
| `dal_data`   | Persistent Elasticsearch data     |
| `mongo_data` | Persistent MongoDB database files |

---

## 🌐 Networking

All services are connected via the custom Docker bridge network `yamas`, allowing them to communicate using service names (e.g., `lang-server`, `vis-api`, etc.).

---

## 🧹 Maintenance

To stop and remove all running services:

```bash
docker compose down
```

To rebuild everything cleanly:

```bash
docker compose down -v --remove-orphans
docker compose up --build -d
```

---

## 🐚 Debugging

To access a container's shell:

```bash
docker exec -it <container_name> /bin/sh
```

---

## 📌 Notes

* Make sure port `8003` is mapped for `vis-api` if you need external access.
* All workspace and log data is shared via mounted volumes (`./workspaces` and `./logs`).

```
