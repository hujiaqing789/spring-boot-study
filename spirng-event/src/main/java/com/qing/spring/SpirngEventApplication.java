package com.qing.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class SpirngEventApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpirngEventApplication.class, args);
    }

}
