package com.test.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping("/test1")
    public String test1(){
        return "test1";
    }

    @PostMapping("/test2")
    public String test2(){
        System.out.println("这里修改了代码2");
        return "test2";
    }


}
