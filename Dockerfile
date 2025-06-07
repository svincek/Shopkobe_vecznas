# -------- STAGE 1: Build the application --------
FROM gradle:8.0.2-jdk17 AS build
WORKDIR /app
COPY . .
RUN gradle clean build --no-daemon

# -------- STAGE 2: Run the application --------
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
