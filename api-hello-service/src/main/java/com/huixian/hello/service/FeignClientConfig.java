package com.huixian.hello.service;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfig {

    @Bean
    public UserSerivceFallback getUserSerivceFallback() {
        return new UserSerivceFallback();
    }
}
