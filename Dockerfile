FROM openjdk:8
ADD target/spring-boot-docker-jenkins-integration.jar spring-boot-docker-jenkins-integration.jar
ENTRYPOINT ["java", "-jar" "/spring-boot-docker-jenkins-integration.jar"]
