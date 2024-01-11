
FROM openjdk:17-jdk-slim

ARG JAR_FILE=target/saveapenny-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

#FROM openjdk:17-jdk-alpine
#ARG JAR_FILE=target/*.jar
#COPY ./target/saveapenny-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java", "-jar", "/app.jar"]





# Ustaw katalog roboczy
#WORKDIR /app
#
## Skopiuj pliki JAR do kontenera
#COPY target/saveapenny.jar .
#
## Port, na którym działa aplikacja
#EXPOSE 8080
#
## Uruchom aplikację
#CMD ["java", "-jar", "saveapenny.jar"]