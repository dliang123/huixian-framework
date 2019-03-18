package com.huixian.hello.service;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description
 * @Author dengliang
 * @Email liang.deng@atzuche.cn
 * @Date Created in 17:43 2019/3/18
 */
@FeignClient(name = "api-user-service",fallback = UserSerivceFallback.class)
public interface UserService {


    @GetMapping(value = "getUser")
    String getUser();


}
  class UserSerivceFallback implements UserService  {

    @Override
    public String getUser() {
        return "user-fallback:111";
    }
}
