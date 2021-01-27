package org.example.service;

import org.example.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("service-provider")
public interface ProductService {

    @RequestMapping(method = RequestMethod.GET, value = "/product/list")
    List<Product> getProducts();

    
}
