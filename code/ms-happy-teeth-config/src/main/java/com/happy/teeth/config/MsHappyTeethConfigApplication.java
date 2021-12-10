package com.happy.teeth.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class MsHappyTeethConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsHappyTeethConfigApplication.class, args);
    }

}
