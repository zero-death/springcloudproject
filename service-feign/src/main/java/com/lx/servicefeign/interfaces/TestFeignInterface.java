package com.lx.servicefeign.interfaces;

import com.lx.servicefeign.hystrix.HystrixClass;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * author 盛兴宇
 */
@FeignClient(value = "EUREKA-CLIENT1" , fallback = HystrixClass.class)
public interface TestFeignInterface {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHi(@RequestParam("name") String name);

}
