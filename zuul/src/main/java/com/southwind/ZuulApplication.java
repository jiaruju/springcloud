package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}

/*
* 注解说明：
* @EnableZuulProxy： 包含了@EnableZuulServer,设置该类是网关的启动类。
* @EnableAutoConfiguration：可以帮助SpringBoot应用将所有符合条件的@Configuration配置加载到
* 当前Spring Boot创建并使用的IoC容器中。
* */
