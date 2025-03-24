FROM openjdk:17
EXPOSE 8080
ADD target/github_action.jar github_action.jar
ENTRYPOINT ["java", "jar", "/github_action.jar"]
