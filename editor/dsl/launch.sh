#! /bin/bash

JAR_FILE="/opt/cz.smartarch.yamas.dsl.parent/cz.smartarch.yamas.dsl.ide/target/cz.smartarch.yamas.dsl.ide-1.0.0-SNAPSHOT-ls.jar"

while [ -f "$JAR_FILE" ] ; do
        java -jar "$JAR_FILE" 2>/opt/logs/lang_server_error.log >/opt/logs/lang_server_access.log
done

echo "cannot find $JAR_FILE"
exit 1 
