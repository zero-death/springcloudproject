package com.lx.serviceribbon.controller;

import com.lx.serviceribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * author 盛兴宇
 */
@RestController
public class TestController {

    @Autowired
    TestService service;

    @RequestMapping("hi")
    public String hi(@RequestParam String name){
        return service.hiService(name);
    }

}
