#!/usr/bin/env bash
docker rm -f $(docker ps -a -q)
docker rmi -f unicorn
docker rmi -f hacker
docker rmi -f eureka
docker rmi $(sudo docker images | grep "^<none>" | awk "{print $3}")
##sudo docker rmi $(sudo docker images | grep "axele" | awk "{print $3}")

docker images
