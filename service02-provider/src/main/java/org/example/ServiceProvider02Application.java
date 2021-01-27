package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
// 开启EurekaClient注解，目前版本如果配置了Eureka注册中心，默认开启该注解
 @EnableEurekaClient
public class ServiceProvider02Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProvider02Application.class, args);
    }
}
