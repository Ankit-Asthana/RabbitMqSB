package com.ankit.rabbitmq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
//this order request will be published to queue
public class Order {
    private String orderId;
    private String name;
    private int quantity;
    private double price;
}
