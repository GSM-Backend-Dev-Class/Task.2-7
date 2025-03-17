package com.gsm._8th.class4.backend.task27.global.time;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.TimeZone;

@Slf4j
@Configuration
public class TimeZoneConfig {

    @Bean
    public TimeZone timeZone() {
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Seoul");
        TimeZone.setDefault(timeZone);
        log.info("TimeZone: {} | Now Time: {} | Current Time: {}", timeZone.getID(), timeZone.getRawOffset(), LocalDateTime.now());
        return timeZone;
    }
}