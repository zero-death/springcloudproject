package com.lx.servicefeign.controller;

import com.lx.servicefeign.interfaces.TestFeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * author 盛兴宇
 */
@RestController
public class TestFeignController {

    @Autowired
    TestFeignInterface testFeignInterface;

    @RequestMapping("hi")
    public String say(@RequestParam String name){
        return testFeignInterface.sayHi(name);
    }

}
