package com.itea.controller;

import com.itea.feign.MFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * @ClassName FeignController
 * @Describe
 * @create 2019-03-27 17:59
 * @Version 1.0
 **/
@RestController
public class FeignController {

    @Autowired
    private MFeignClient feignClient;

    @GetMapping("/feign/{wd}")
    public Mono<String> sayHelloWorld(@PathVariable("wd") String parm) {
        String result = feignClient.sayHelloWorld(parm);
        return Mono.just(result);
    }

    @GetMapping("/feign/list")
    public Flux<Integer> list() {
        List<Integer> list = feignClient.list();
        Flux<Integer> userFlux = Flux.fromIterable(list);
        return userFlux;
    }

    @GetMapping("/feign/array")
    public Flux<Integer> array() {
        Integer[] arrays = feignClient.array();
        Flux<Integer> userFlux = Flux.fromArray(arrays);
        return userFlux;
    }
}
