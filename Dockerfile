FROM gradle:8-jdk-alpine AS builder
WORKDIR /app
COPY --chown=gradle:gradle . .
RUN gradle build --no-daemon
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
CMD ["java", "-jar", "app.jar"]
