package com.pwl.springbootrabbitmq.Receiver;

import com.pwl.springbootrabbitmq.config.RabbitConfig;
import com.pwl.springbootrabbitmq.entity.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TopicReceiver {
    // queues是指要监听的队列的名字
    @RabbitListener(queues = RabbitConfig.TOPIC_QUEUE1)
    public void receiveTopic1(User user) {
        System.out.println("【receiveTopic1监听到消息】" + user.toString());
    }
    @RabbitListener(queues = RabbitConfig.TOPIC_QUEUE2)
    public void receiveTopic2(User user) {
        System.out.println("【receiveTopic2监听到消息】" + user.toString());
    }
}
