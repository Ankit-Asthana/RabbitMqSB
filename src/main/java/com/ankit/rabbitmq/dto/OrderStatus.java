package com.ankit.rabbitmq.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
//order status response will return back to end user
public class OrderStatus {
    private Order order;
    private String orderStatus;
    private String message;

}
