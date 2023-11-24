#Referenciamos version de jdk
FROM openjdk:17
#Definimos un punto de montaje
VOLUME /tmp
#Puerto al que vamos a exponer
EXPOSE 8080
#Agregamos el archivo ejecutable
ADD ./target/ToDoAPP-0.0.1-SNAPSHOT.jar todoApp.jar
#Ejecutamos nuestro jar mediante java
ENTRYPOINT ["java", "-jar", "/todoApp.jar"]