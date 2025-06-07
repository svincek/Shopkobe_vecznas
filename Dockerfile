# Use a base image with JDK
FROM openjdk:21-jdk

# Set the working directory
WORKDIR /app

# Copy the Gradle build files
COPY build/libs/*.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

