package com.lucfzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
// 开启feign包扫描
@EnableFeignClients(basePackages = {"com.lucfzy.feign"})
public class OrderAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderAppApplication.class, args);
    }
}