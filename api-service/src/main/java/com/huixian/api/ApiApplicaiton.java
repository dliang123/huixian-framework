package com.huixian.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author dengliang
 * @Email liang.deng@atzuche.cn
 * @Date Created in 16:57 2019/3/12
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableAutoConfiguration
@RestController
public class ApiApplicaiton {

    public static void main(String[] args) {
//        new SpringApplicationBuilder(ApiApplicaiton.class).web(WebApplicationType.SERVLET).run(args);
        SpringApplication.run(ApiApplicaiton.class,args);
    }

    @GetMapping(value = "hello")
    public String hello(){

        return "hello world";
    }
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(ApiApplicaiton.class);
//    }



}
