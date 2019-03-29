package com.itea.controller;

import com.itea.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Describe
 * @create 2019-03-27 20:26
 * @Version 1.0
 **/
@RestController
public class TestController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi/{name}")
    public String sayHi(@PathVariable("name") String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
