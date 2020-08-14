package com.lx.eurekaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(AppClient2Application.class, args);
    }

}
