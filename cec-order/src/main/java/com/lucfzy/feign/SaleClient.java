package com.lucfzy.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "cec-sale")
public interface SaleClient {

    @GetMapping("/v1/getSaleList")
    String getSaleList();

}
