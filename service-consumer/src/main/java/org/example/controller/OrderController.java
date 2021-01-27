package org.example.controller;


import org.aspectj.weaver.ast.Or;
import org.example.pojo.Order;
import org.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order/{orderId}")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping
    public Order getOrder(@PathVariable("orderId") Integer id) {
        return orderService.getOrder(id);
    }

}
