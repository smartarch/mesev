#!/bin/sh
echo "Running ..."
python /app/run.py 2>/opt/logs/fs_error.log >/opt/logs/fs_access.log
