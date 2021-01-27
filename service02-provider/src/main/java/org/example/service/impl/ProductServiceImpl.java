package org.example.service.impl;

import org.example.pojo.Product;
import org.example.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> selectProductionList() {
        return Arrays.asList(
                new Product(1, "华为手机", 2, 5880D),
                new Product(2, "联想笔记本", 2, 6880D),
                new Product(3, "xiaomishouji", 2, 2660D)
        );
    }
}
