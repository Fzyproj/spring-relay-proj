package com.lucfzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SaleAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(SaleAppApplication.class, args);
    }
}
