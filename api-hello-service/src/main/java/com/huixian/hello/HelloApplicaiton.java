package com.huixian.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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
public class HelloApplicaiton {

    public static void main(String[] args) {
//        new SpringApplicationBuilder(ApiApplicaiton.class).web(WebApplicationType.SERVLET).run(args);
        SpringApplication.run(HelloApplicaiton.class,args);
    }


//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(ApiApplicaiton.class);
//    }



}
