package com.itea.controller;

import com.itea.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Describe
 * @create 2019-03-27 20:09
 * @Version 1.0
 **/
@RestController
public class TestController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hi/{name}")
    public String hi(@PathVariable("name") String name) {
        return helloService.hiService(name);
    }
}
