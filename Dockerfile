# Define o ponto de partida da imagem
FROM openjdk:8-jdk-alpine 

# Definir o nosso ambiente de trabalho
#WORKDIR

ARG JAR_FILE=target/ApiProjectManagement-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} ApiProjectManagement-0.0.1-SNAPSHOT.jar

# Define quais serão os comandos executados na etapa de criação de camadas da imagem
RUN ls -la

#CMD

EXPOSE 5005
EXPOSE 8080

ENTRYPOINT ["java","-jar","/ApiProjectManagement-0.0.1-SNAPSHOT.jar"]
