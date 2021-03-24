package com.lucfzy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SaleController {

    @GetMapping("/v1/getSaleList")
    public String getSaleList() {
        log.info("获取商品信息成功");
        return "sale list is: 123,456";
    }

}
