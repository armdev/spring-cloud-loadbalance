# spring-cloud-loadbalance
spring-cloud-loadbalance using docker-compose

Testing new Spring Cloud LoadBalancer

Start ./run.sh

It will build and deploy application using docker-compose.
In the docker-compose we have 2 unicorn services, and hacker microservice try to connect to unicorn.

Endpoint is http://localhost:2020/hacker/attack 

Note: Load Balancer does not work with eureka. 
      Sporing Load Balancer does not work with docker services stack.
      
      I guess if you deploy application with docker swarm/stack, you need not spring load balancer, docker service already do   it.
      
      Spring bload balancer works if you by yourself define your instances.
      
      
