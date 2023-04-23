package com.jiaqing.tooldesensitization.serialize;

import cn.hutool.core.util.DesensitizedUtil;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import lombok.SneakyThrows;

/**
 * @Author JiaQIng
 * @Description 脱敏序列化
 * @ClassName DesensitizedSerialize
 * @Date 2023/4/17 21:57
 **/
public class TestJacksonSerialize extends JsonSerializer<String> {

    @Override
    @SneakyThrows
    public void serialize(String str, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        // 使用我们的hutool工具类进行手机号脱敏
        jsonGenerator.writeString(DesensitizedUtil.fixedPhone(String.valueOf(str)));
    }
}
