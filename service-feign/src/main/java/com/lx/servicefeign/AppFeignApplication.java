package com.lx.servicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppFeignApplication.class, args);
    }

}
