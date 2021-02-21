FROM openjdk:8
EXPOSE 8080
ADD target/maven-02-docker-push.jar maven-02-docker-push.jar
ENTRYPOINT ["java" , "-jar" , "/maven-02-docker-push.jar"]