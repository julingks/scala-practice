#!/usr/bin/env bash
set -e

if [ $# -ge 2 ] || [ $# -eq 0 ]
then
    echo "usage: .run.sh [scala]"
    exit 1
fi

scalac $1.scala
scala -classpath . $1

rm *.class
