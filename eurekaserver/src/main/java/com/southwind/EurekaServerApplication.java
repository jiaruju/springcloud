package com.southwind;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}

/*
* 注解说明：
* @SpringBootApplication：声明该类是Spring boot服务的入口
* @EnableEurekaServer： 声明该类是一个Eureka Server微服务，提供服务注册和服务发现功能，即注册中心
* */