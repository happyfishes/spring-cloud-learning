package com.itea.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MFeignClient
 * @Describe
 * @create 2019-03-27 17:42
 * @Version 1.0
 **/
@Configuration
public class MFeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
