package com.example.returnjson;

import com.example.order.Order;
import lombok.Data;

@Data
public class OrderFindJson {
    private Integer statue;
    private String info;
    private Order order;
}
