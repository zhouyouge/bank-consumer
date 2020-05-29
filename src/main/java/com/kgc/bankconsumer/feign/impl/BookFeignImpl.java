package com.kgc.bankconsumer.feign.impl;

import com.kgc.bankconsumer.feign.BookFeign;
import com.kgc.entity.UserInfo;
import org.springframework.stereotype.Component;

@Component
public class BookFeignImpl implements BookFeign {
    @Override
    public UserInfo getUser(UserInfo userInfo) {
        System.out.println("请求失败");
        return null;
    }
}
