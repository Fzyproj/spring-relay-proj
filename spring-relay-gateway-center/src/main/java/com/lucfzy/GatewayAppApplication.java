package com.lucfzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.BooleanSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.server.ServerWebExchange;

import java.util.Objects;
import java.util.function.Predicate;

@SpringBootApplication
@EnableEurekaClient
public class GatewayAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayAppApplication.class ,args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("route_match_1", r -> {
                    Route.AsyncBuilder matchRule = r.path("/v1/getSaleInfo")
                            .uri("lb://cec-order");
                    // 精确匹配http请求方式
                    matchRule.predicate(serverWebExchange -> Objects.requireNonNull(serverWebExchange.getRequest().getMethod()).matches("GET"));
                    return matchRule;
                })// 微服务名不区分大小写
                .build();
    }
}