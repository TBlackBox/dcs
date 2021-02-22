package com.dcs.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //启动eureka 客服端
public class DcsGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DcsGatewayApplication.class, args);
    }

}
