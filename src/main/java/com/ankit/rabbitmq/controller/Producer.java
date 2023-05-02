//package com.ankit.rabbitmq.controller;
//
//import com.ankit.rabbitmq.config.MessageConfig;
//import com.ankit.rabbitmq.model.Message;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/mes")
//public class Producer {
//    @Autowired
//    private RabbitTemplate template;
//
//    @PostMapping("/post")
//    public String send(Message message){
//        template.convertAndSend(MessageConfig.EXCHANGE,MessageConfig.ROUTING_KEY,message);
//        return "Success !!";
//    }
//}
