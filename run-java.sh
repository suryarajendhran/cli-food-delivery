#!/bin/bash
if [ -z "$1" ]; then
    echo "Usage: run-java <JavaClassName>"
    exit 1
fi

CLASS_NAME="$1"

docker run --rm -it -v "$(pwd)":/usr/src/app -w /usr/src/app openjdk:latest sh -c "javac ${CLASS_NAME}.java && java ${CLASS_NAME}" || {
    echo "Failed to compile or run ${CLASS_NAME}.java"
    exit 1
}
