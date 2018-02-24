package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2018/2/24.
 */
@RestController
public class TestController {

    @RequestMapping("/moduleOne/showName")
    public String showName(){
        return "这是从moduleOne子模块中发出的信息showName";
    }

}
