package com.itea.service.impl;

import com.itea.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @ClassName SchedualServiceHiHystric
 * @Describe
 * @create 2019-03-29 13:35
 * @Version 1.0
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
