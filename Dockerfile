FROM java:8

LABEL maintainer="biasmj016"

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=build/libs/example.jar
ADD ${JAR_FILE} to-do-springboot.jar

ENTRYPOINT ["java","-jar","/to-do-springboot.jar"]
