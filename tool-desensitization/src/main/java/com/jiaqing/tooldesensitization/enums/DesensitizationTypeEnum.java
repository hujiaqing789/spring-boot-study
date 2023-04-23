package com.jiaqing.tooldesensitization.enums;

/**
 * @Author JiaQIng
 * @Description 数据脱敏枚举
 * @ClassName DesensitizedTypeEnum
 * @Date 2023/4/17 21:39
 **/
public enum DesensitizationTypeEnum {
    //自定义
    CUSTOMER,
    //用户id
    USER_ID,
    //中文名
    CHINESE_NAME,
    //身份证号
    ID_CARD,
    //座机号
    FIXED_PHONE,
    //手机号
    MOBILE_PHONE,
    //地址
    ADDRESS,
    //电子邮件
    EMAIL,
    //密码
    PASSWORD,
    //中国大陆车牌，包含普通车辆、新能源车辆
    CAR_LICENSE,
    //银行卡
    BANK_CARD
}

