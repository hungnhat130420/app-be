FROM openjdk:11
MAINTAINER hungnguyen.130420@gmail.com
ARG PACKAGED_JAR=target/proj1-0.0.1-SNAPSHOT.jar
ADD ${PACKAGED_JAR} app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
