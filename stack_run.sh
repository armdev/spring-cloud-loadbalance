#!/bin/bash

### https://docs.docker.com/engine/reference/commandline/stack_deploy/
### https://docs.docker.com/compose/compose-file/
### https://docs.docker.com/engine/reference/commandline/stack_rm/
###  sudo docker stack rm health backend

mvn clean install -pl eureka  -am -DskipTests=true
mvn clean install -pl unicorn  -am -DskipTests=true
mvn clean install -pl hacker  -am -DskipTests=true

docker build -t eureka eureka
docker build -t unicorn unicorn
docker build -t hacker hacker
#docker-compose up -d --build eureka
#docker-compose up -d --build unicorn
#docker-compose up -d --build hacker

docker stack deploy --compose-file lb_stack.yml unicorn

docker ps -a




