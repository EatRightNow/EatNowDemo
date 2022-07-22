package com.example.eatnowdemo2.controller;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    String  test(){
        return "我把你的Bug改好了";
    }
}
