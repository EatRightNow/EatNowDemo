package com.example.eatnowdemo2.controller;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    void  test(){
        return  System.out.println("写一写Bug提交给大家");
    }
}
