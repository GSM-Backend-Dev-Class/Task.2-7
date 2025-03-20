# Dockerfile을 작성하여주세요
FROM gradle:8.3-jdk17 As builder
WORKDIR /build

ENV GRADLE_OPTS="-Dorg.gradle.daemon=false -Dfile.encoding=UTF-8"
ENV JAVA_OPTS="-Xms512m -Xmx1024m"

COPY . /build
RUN gradle build -x test --parallel

FROM openjdk:23-jdk-slim
WORKDIR /build
ENV LANG=C.UTF-8
ENV JAVA_OPTS="-Dfile.encoding=UTF-8"
COPY --from=builder /build/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "app.jar"]