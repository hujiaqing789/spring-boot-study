package com.jiaqing.tooldesensitization.api;

import com.jiaqing.tooldesensitization.dto.TestAnnotationDTO;
import com.jiaqing.tooldesensitization.dto.TestDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author JiaQIng
 * @Description 测试api
 * @ClassName TestApi
 * @Date 2023/4/23 20:16
 **/
@RestController
@RequestMapping("/test")
public class TestApi {

    @GetMapping
    public TestDTO test(){
        TestDTO testDTO = new TestDTO();
        testDTO.setPhone("17677772345");
        return testDTO;
    }

    @GetMapping("/test-annotation")
    public TestAnnotationDTO testAnnotation(){
        TestAnnotationDTO testAnnotationDTO = new TestAnnotationDTO();
        testAnnotationDTO.setPhone("17677772345");
        testAnnotationDTO.setCustom("111111111111111111");
        testAnnotationDTO.setEmail("1433926101@qq.com");
        testAnnotationDTO.setIdCard("4444199810015555");
        return testAnnotationDTO;
    }

}
