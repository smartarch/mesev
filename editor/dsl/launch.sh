#! /bin/bash

JAR_FILE="/opt/com.mseve.dsl.parent/com.mseve.dsl.ide/target/com.mesev.dsl.ide-1.0.0-SNAPSHOT-ls.jar"

while [ -f "$JAR_FILE" ] ; do
        java -jar "$JAR_FILE"
done

echo "cannot find $JAR_FILE"
exit 1 