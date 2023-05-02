package com.ankit.rabbitmq.consumer;

import com.ankit.rabbitmq.config.MessageConfig;
import com.ankit.rabbitmq.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User{
    @RabbitListener(queues = MessageConfig.QUEUE) //from which queue the messsage will passed
    public void consumerMessageFromQueue(OrderStatus orderStatus){
        System.out.println("Message recieved from queue "+orderStatus);
    }
}
