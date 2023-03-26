package com.qing.spring.listener;


import com.qing.spring.event.UserChangePasswordEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author JiaQIng
 * @Description 发送短信监听器
 * @ClassName MessageListener
 * @Date 2023/3/26 14:16
 **/
@Component
public class MessageListener implements ApplicationListener<UserChangePasswordEvent> {

    @Override
    public void onApplicationEvent(UserChangePasswordEvent event) {
        System.out.println("收到事件:" + event);
        System.out.println("开始执行业务操作给用户发送短信。用户userId为：" + event.getUserId());
    }
}
