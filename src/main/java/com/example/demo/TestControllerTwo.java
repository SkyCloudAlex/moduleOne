package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2018/2/24.
 */
@RestController
public class TestControllerTwo {


    @RequestMapping("/showNameTwo")
    public String showNameTwo(){
        return "这是从moduleOne子模块中发出的信息showNameTwo";
    }

}
