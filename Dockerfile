# Dockerfile을 작성하여주세요
FROM gradle:8.3-jdk17 AS builder
WORKDIR /build

COPY . /build
RUN gradle build -x test --parallel

FROM openjdk:23-jdk-slim
ENV SPRING_PROFILES_ACTIVE=test
WORKDIR /build
COPY --from=builder /build/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "app.jar"]
