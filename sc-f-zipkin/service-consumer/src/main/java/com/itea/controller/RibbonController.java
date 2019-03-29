package com.itea.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.loadbalancer.LoadBalancerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Mono;

/**
 * @ClassName RibbonController
 * @Describe
 * @create 2019-03-27 17:19
 * @Version 1.0
 **/
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/ribbon/{wd}")
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public Mono<String> sayHelloWorld(@PathVariable("wd") String param){
        String res = this.restTemplate.getForObject("http://service-provider/test/" + param, String.class);
        return Mono.just(res);
    }

    public Mono<String> fallbackMethod(@PathVariable("wd") String param){
        return Mono.just("fallback");
    }
}
