FROM openjdk:11-jdk-slim

VOLUME /tpm

ARG JAR_FILE=target/*.jar

ADD app/target/projeto_Teste-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

RUN bash -c 'touch /app.jar'

ENTRYPOINT ["java","Djava.security.egd=file:/dev/./urandom", "-jar","/app.jar"]