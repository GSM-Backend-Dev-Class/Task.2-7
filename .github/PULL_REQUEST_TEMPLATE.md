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

```![ㅁㄴㅇㅁㄴㅇ.png](..%2Fscreenshot%2F%E3%85%81%E3%84%B4%E3%85%87%E3%85%81%E3%84%B4%E3%85%87.png)
![화면 캡처 2025-03-20 172924.png](..%2Fscreenshot%2F%ED%99%94%EB%A9%B4%20%EC%BA%A1%EC%B2%98%202025-03-20%20172924.png)
![화면 캡처 2025-03-20 173337.png](..%2Fscreenshot%2F%ED%99%94%EB%A9%B4%20%EC%BA%A1%EC%B2%98%202025-03-20%20173337.png)
![화면 캡처 2025-03-20 174529.png](..%2Fscreenshot%2F%ED%99%94%EB%A9%B4%20%EC%BA%A1%EC%B2%98%202025-03-20%20174529.png)
![화면 캡처 2025-03-20 174705.png](..%2Fscreenshot%2F%ED%99%94%EB%A9%B4%20%EC%BA%A1%EC%B2%98%202025-03-20%20174705.png)
## 📷 API 요청 결과 스크린샷
