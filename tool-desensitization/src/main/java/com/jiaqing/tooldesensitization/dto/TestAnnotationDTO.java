package com.jiaqing.tooldesensitization.dto;

import com.jiaqing.tooldesensitization.annotation.Desensitization;
import com.jiaqing.tooldesensitization.enums.DesensitizationTypeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author JiaQIng
 * @Description 测试DTO
 * @ClassName TestDTO
 * @Date 2023/4/23 19:43
 **/
@Data
public class TestAnnotationDTO implements Serializable {
    /**
     * 自定义
     */
    @Desensitization(type = DesensitizationTypeEnum.CUSTOMER,startInclude = 5,endExclude = 10)
    private String custom;
    /**
     * 手机号
     */
    @Desensitization(type = DesensitizationTypeEnum.MOBILE_PHONE)
    private String phone;
    /**
     * 邮箱
     */
    @Desensitization(type = DesensitizationTypeEnum.EMAIL)
    private String email;
    /**
     * 身份证
     */
    @Desensitization(type = DesensitizationTypeEnum.ID_CARD)
    private String idCard;


}
