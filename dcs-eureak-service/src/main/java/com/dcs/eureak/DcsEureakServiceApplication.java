package com.dcs.eureak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DcsEureakServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DcsEureakServiceApplication.class, args);
    }

}
