package com.jiaqing.tooldesensitization.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.jiaqing.tooldesensitization.serialize.TestJacksonSerialize;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author JiaQIng
 * @Description 测试DTO
 * @ClassName TestDTO
 * @Date 2023/4/23 19:43
 **/
@Data
public class TestDTO implements Serializable {
    /**
     * 手机号
     */
    @JsonSerialize(using = TestJacksonSerialize.class)
    private String phone;
}
