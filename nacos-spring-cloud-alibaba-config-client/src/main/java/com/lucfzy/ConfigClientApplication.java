package com.lucfzy;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 默认拉取dataId=app1，groupId=DEFAULT_GROUP下面的配置。
@NacosPropertySource(dataId = "app1", autoRefreshed = true)
// 默认拉取dataId=app1，groupId=application下面的配置。
@NacosPropertySource(dataId = "app1", groupId = "application", autoRefreshed = true)
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

}
