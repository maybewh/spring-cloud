package org.example.service;

import org.example.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductService productService;

    @Override
    public Order getOrder(Integer id) {
        return new Order(1, "order-no001", "中国", 22780D, productService.getProducts());
    }
}
