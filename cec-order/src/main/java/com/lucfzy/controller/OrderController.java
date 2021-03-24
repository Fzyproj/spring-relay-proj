package com.lucfzy.controller;

import com.lucfzy.feign.SaleClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class OrderController {

    @Autowired
    private SaleClient saleClient;

    /**
     * 获取商品信息
     */
    @GetMapping("/v1/getSaleInfo")
    public void getSaleInfo() {
        String saleResult = saleClient.getSaleList();
        log.info("我已经获取到了商品列表: {}", saleResult);
    }

    /**
     * 获取商品信息
     */
    @GetMapping("/v1/getOrders")
    public String getOrderList() {
        log.info("我已经获得了订单信息");
        return "order is : 123456789";
    }

}
