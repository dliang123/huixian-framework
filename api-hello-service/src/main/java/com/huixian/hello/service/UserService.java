package com.huixian.hello.service;

import feign.hystrix.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description
 * 使用feign实现客户端远程调用服务
 * 可以使用fallbackFactory或者fallback实现服务降级
 * fallback实现服务降级需要和configuration配合使用，实例降级类
 * fallback实现服务降级需要在工厂类中实现降级接口的实现及实例化
 * @Author dengliang
 * @Email liang.deng@atzuche.cn
 * @Date Created in 17:43 2019/3/18
 */
@FeignClient(name = "user-service2", fallbackFactory = UserSerivceFallbackFactory.class)
public interface UserService {


    @GetMapping(value = "getUser")
    String getUser();


}

@Component
class UserSerivceFallbackFactory implements FallbackFactory<UserService>{

    @Override
    public UserService create(Throwable cause) {
        return new UserService() {
            @Override
            public String getUser() {
                System.out.println("fallback reason was : "+cause.getMessage());
                return "user-fallback:222";
            }
        };
    }
}

