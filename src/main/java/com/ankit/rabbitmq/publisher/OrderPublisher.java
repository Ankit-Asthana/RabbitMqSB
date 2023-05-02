package com.ankit.rabbitmq.publisher;

import com.ankit.rabbitmq.config.MessageConfig;
import com.ankit.rabbitmq.dto.Order;
import com.ankit.rabbitmq.dto.OrderStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderPublisher {
    @Autowired
    private RabbitTemplate template;

    @PostMapping("/{resturantName}")
    public String bookOrder(@RequestBody Order order, @PathVariable String resturantName){
        order.setOrderId(UUID.randomUUID().toString());
        //resturant service
        //order service
        OrderStatus orderStatus=new OrderStatus(order,"Process","order placed successfully in "+resturantName);
        //publish this message to queue so that the user can get the message
        template.convertAndSend(MessageConfig.EXCHANGE,MessageConfig.ROUTING_KEY,orderStatus);
        return "Success";
    }
}
