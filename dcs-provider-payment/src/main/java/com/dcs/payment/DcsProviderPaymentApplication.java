package com.dcs.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //启动eureka 客服端
public class DcsProviderPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(DcsProviderPaymentApplication.class, args);
    }

}
