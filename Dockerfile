FROM openjdk:17-alpine

ENV APP_NAME turbopark-0.0.1-SNAPSHOT

COPY target/${APP_NAME}.jar ${APP_NAME}.jar

CMD java -jar ${APP_NAME}.jar

EXPOSE 8080