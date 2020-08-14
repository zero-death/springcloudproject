package com.lx.servicefeign.hystrix;

import com.lx.servicefeign.interfaces.TestFeignInterface;
import org.springframework.stereotype.Component;

/**
 * author 盛兴宇
 */
@Component
public class HystrixClass implements TestFeignInterface {
    @Override
    public String sayHi(String name) {
        return "i am sorry , have a bug";
    }
}
