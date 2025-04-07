FROM gradle:8-jdk-alpine AS builder
WORKDIR /app
COPY --chown=gradle:gradle . .
RUN gradle build --no-daemon
FROM openjdk:17-jdk-slim AS runtime
WORKDIR /app
COPY --from=builder /app/build/libs/task27-0.0.1-SNAPSHOT.jar app.jar
ENV APP_JAR=app.jar
CMD ["java", "-jar", "$APP_JAR"]