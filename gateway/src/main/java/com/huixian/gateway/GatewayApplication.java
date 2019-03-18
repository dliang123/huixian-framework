package com.huixian.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @Description
 * @Author dengliang
 * @Email liang.deng@atzuche.cn
 * @Date Created in 15:05 2019/3/11
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class,args);
    }


    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("url_path",r -> r.path("/course")
                        .filters(f->f.stripPrefix(1))
                        .uri("http://cxytiandi.com")
                )
//                .route("cust_router",p -> p
//                        .path("hello-service2/**")
////                        .filters(f->f.stripPrefix(1))
////                        .filters(f -> f.addRequestHeader("Hello", "World"))
////                        .uri("lb://hello-service"))
//                        .uri("http://localhost:8082"))
                .build();
    }
}
