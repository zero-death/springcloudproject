package com.lx.serviceribbon.service;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.hystrix.FallbackHandler;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * author 盛兴宇
 */
@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String hiService(String name){
        //第一个参数为请求地址 , 第二个参数为响应类型
        return restTemplate.getForObject("http://eureka-client1/hi?name="+name, String.class);
    }

    public String error(String name){
        return "i am sorry , have a problem";
    }
}
