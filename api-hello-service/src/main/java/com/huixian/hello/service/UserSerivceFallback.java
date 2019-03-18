package com.huixian.hello.service;

public class UserSerivceFallback implements UserService {

    @Override
    public String getUser() {
        return "user-fallback:111";
    }
}
