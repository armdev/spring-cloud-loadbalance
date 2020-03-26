#!/usr/bin/env bash

set -e
# ab -n 1000 -c 100 -l   http://localhost:2020/hacker/stack
# ab -n 1000 -c 100 http://localhost:2030/data
# http://localhost:8761/eureka/apps
echo "Build the system"
mvn clean package -U -Dmaven.test.skip=true
#mvn clean install -pl backend -am -DskipTests=true




