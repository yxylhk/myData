package com.example.controller;

import com.example.order.Order;
import com.example.returnjson.OrderFindJson;
import com.example.returnjson.OrderJson;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public OrderJson add(@RequestBody Order order){
        OrderJson orderJson = new OrderJson();
        orderJson.setInfo("添加");
        orderJson.setData("失败");
        orderJson.setStatue(200);
        boolean isOk = orderService.add(order);
        if(isOk==true){
            orderJson.setData("成功");
        }
        return orderJson;
    }

    @DeleteMapping("/{oid}")
    public OrderJson del(@PathVariable Integer oid){
        boolean isOk = orderService.del(oid);
        OrderJson orderJson = new OrderJson();
        orderJson.setInfo("删除");
        orderJson.setData("失败");
        orderJson.setStatue(200);

        if(isOk==true){
            orderJson.setData("成功");
        }
        return orderJson;
    }

    @PutMapping
    public OrderJson update(@RequestBody Order order){
        boolean isOk = orderService.update(order);
        OrderJson orderJson = new OrderJson();
        orderJson.setInfo("修改");
        orderJson.setData("失败");
        orderJson.setStatue(200);

        if(isOk==true){
            orderJson.setData("成功");
        }
        return orderJson;
    }

    @GetMapping("/{oid}")
    public OrderFindJson find(@PathVariable Integer oid){
        Order order = orderService.findById(oid);
        OrderFindJson orderFindJson = new OrderFindJson();
        orderFindJson.setInfo("查询一条数据");
        orderFindJson.setStatue(200);
        orderFindJson.setOrder(order);
        return orderFindJson;
    }
}
