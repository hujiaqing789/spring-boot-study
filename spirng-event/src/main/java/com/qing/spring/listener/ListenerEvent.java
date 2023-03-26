package com.qing.spring.listener;

import com.qing.spring.event.UserChangePasswordEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * @Author JiaQIng
 * @Description 事件监听器
 * @ClassName LogListener
 * @Date 2023/3/26 14:22
 **/
@Component
public class ListenerEvent {

    @Async
    @EventListener({ UserChangePasswordEvent.class })
    public void logListener(UserChangePasswordEvent event) {
        System.out.println("收到事件:" + event);
        System.out.println("开始执行业务操作生成关键日志。用户userId为：" + event.getUserId());
    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT,value = { UserChangePasswordEvent.class })
    public void messageListener(UserChangePasswordEvent event) {
        System.out.println("收到事件:" + event);
        System.out.println("开始执行业务操作给用户发送短信。用户userId为：" + event.getUserId());
    }
}
