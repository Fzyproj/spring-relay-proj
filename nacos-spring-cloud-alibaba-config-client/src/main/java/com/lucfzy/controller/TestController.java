package com.lucfzy.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @NacosValue(value = "${gray_flag:close}", autoRefreshed = true)
    String name;
    @NacosValue(value = "${useLocalCache:local}", autoRefreshed = true)
    String cache;
    @NacosValue(value = "${config:default}", autoRefreshed = true)
    String config;
    @NacosValue(value = "${order-switch:closed}", autoRefreshed = true)
    String orderSwitch;

    @GetMapping("/demo")
    public String demo() {
        return name;
    }

    @GetMapping("/cache")
    public String cache() {
        return cache;
    }

    @GetMapping("/config")
    public String config() {
        return config;
    }

    @GetMapping("/orderSwitch")
    public String orderSwitch() {
        return orderSwitch;
    }
}