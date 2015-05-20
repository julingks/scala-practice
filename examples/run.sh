#!/usr/bin/env bash
set -e

if [ $# -ne 1 ]
then
    echo "usage: .run.sh [scala]"
    exit 1
fi

FILENAME="${1%%.*}"
EXT="${1##*.}"

if [ $EXT != "scala" ]; then
    echo ".scala file only!"
    exit 1
fi

scalac -deprecation $1
scala -classpath . $FILENAME

rm *.class
