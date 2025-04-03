## 🐋 Dockerfile 내용
```dockerfile
FROM gradle:8-jdk-alpine AS builder
WORKDIR /app
COPY --chown=gradle:gradle . .
RUN gradle build --no-daemon
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
CMD ["java", "-jar", "app.jar"]
```

## 📷 API 요청 결과 스크린샷
