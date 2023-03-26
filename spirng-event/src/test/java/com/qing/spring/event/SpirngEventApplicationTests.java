package com.qing.spring.event;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;

@SpringBootTest
class SpirngEventApplicationTests {
    @Autowired
    ApplicationEventPublisher appEventPublisher;
    @Test
    void contextLoads() {
        appEventPublisher.publishEvent(new UserChangePasswordEvent("1111111"));
    }

}
