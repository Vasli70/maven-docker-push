FROM openjdk:8
EXPOSE 8080
ADD target/maven-docker-push.jar maven-docker-push.jar
ENTRYPOINT ["java" , "-jar" , "/maven-docker-push.jar"]