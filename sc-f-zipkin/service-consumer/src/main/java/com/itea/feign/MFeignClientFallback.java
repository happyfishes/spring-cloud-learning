package com.itea.feign;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MFeignClientFallback
 * @Describe
 * @create 2019-03-27 17:42
 * @Version 1.0
 **/
@Component
public class MFeignClientFallback implements MFeignClient{

    @Override
    public String sayHelloWorld(String msg) {
        return "fallback";
    }

    @Override
    public List<Integer> list() {
        return new ArrayList<>();
    }

    @Override
    public Integer[] array() {
        return new Integer[0];
    }
}
