package com.huixian.hello.controller;

import com.huixian.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author dengliang
 * @Email liang.deng@atzuche.cn
 * @Date Created in 18:05 2019/3/18
 */
@RestController
public class HelloController {


    @Autowired
    private UserService userService;

    @GetMapping(value = "hello")
    public String hello(){

        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(1,2);
        return "hello ->  "+ userService.getUser();
    }

}
