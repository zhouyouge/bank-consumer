package com.kgc.bankconsumer.controller;

import com.kgc.bankconsumer.feign.BookFeign;
import com.kgc.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
  private    BookFeign bookFeign;
    @RequestMapping("/login")
    public  Object loginUser(UserInfo userInfo){
        for(int i=0;i<10;i++){
            bookFeign.getUser(userInfo);
        }
        UserInfo u= bookFeign.getUser(userInfo);
        return u;
    }

}
