FROM openjdk:8-jre-alpine
COPY target/eureka.jar /opt/eureka.jar
ENTRYPOINT ["java",  "-XX:+UseParallelGC", "-Xms2048m", "-Xmx4096m", "-XX:MetaspaceSize=2048m", "-XX:+UnlockExperimentalVMOptions",  "-Djava.net.preferIPv4Stack=true", "-jar","/opt/eureka.jar"]
EXPOSE 8761
