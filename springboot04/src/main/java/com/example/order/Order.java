package com.example.order;

import lombok.Data;

@Data
public class Order {
    private Integer orderId;
    private String orderName;
    private double orderPrice;
    private Integer orderUserId;
}
