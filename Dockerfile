FROM java:8

LABEL maintainer="test"

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=build/libs/*.jar
VOLUME /tmp
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
