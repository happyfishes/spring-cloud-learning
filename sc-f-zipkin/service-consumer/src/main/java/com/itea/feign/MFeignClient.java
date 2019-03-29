package com.itea.feign;

import com.itea.feign.config.MFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @ClassName MFeignClient
 * @Describe
 * @create 2019-03-27 17:41
 * @Version 1.0
 **/
@FeignClient(name = "service-provider", fallback = MFeignClientFallback.class, configuration = MFeignConfig.class)
public interface MFeignClient {

    @GetMapping(value = "/test/msg")
    String sayHelloWorld(@PathVariable("msg") String msg);

    @GetMapping(value = "/test/list")
    List<Integer> list();

    @GetMapping(value = "/test/list")
    Integer[] array();
}
