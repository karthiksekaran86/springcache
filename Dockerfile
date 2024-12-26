FROM openjdk:17-jdk-alpine
COPY target/springcache-1.jar springcache-1.jar
ENTRYPOINT ["java","-jar","/springcache-1.jar"]