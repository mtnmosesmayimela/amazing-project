FROM openjdk:11.0-jre-slim
ADD amazing-project*.jar /home/amazing-project.jar
CMD ["java", "-jar", "/home/amazing-project.jar"]