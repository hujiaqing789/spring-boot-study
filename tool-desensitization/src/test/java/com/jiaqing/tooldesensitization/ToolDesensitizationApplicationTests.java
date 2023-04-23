package com.jiaqing.tooldesensitization;

import cn.hutool.core.util.DesensitizedUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ToolDesensitizationApplicationTests {

    @Test
    void contextLoads() {
        String phoneNumber = "17677772345";
        System.out.println(DesensitizedUtil.mobilePhone(phoneNumber));
    }

}
