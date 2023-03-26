package com.qing.spring.event;


import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * @Author JiaQIng
 * @Description 修改密码事件
 * @ClassName UserChangePasswordEvent
 * @Date 2023/3/26 13:55
 **/
@Getter
@Setter
public class UserChangePasswordEvent extends ApplicationEvent {
    private String userId;

    public UserChangePasswordEvent(String userId) {
        super(new Object());
        this.userId = userId;
    }
}
