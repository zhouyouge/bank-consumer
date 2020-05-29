package com.kgc.bankconsumer.feign;

import com.kgc.bankconsumer.feign.impl.BookFeignImpl;
import com.kgc.entity.UserInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "bank-provider",fallback = BookFeignImpl.class)
public interface BookFeign {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public UserInfo getUser(@RequestBody UserInfo userInfo);
}
