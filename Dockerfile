FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} projeto_teste.jar

RUN bash -c 'touch /projeto_teste.jar'

ENTRYPOINT ["java","-jar","/projeto_teste.jar"]