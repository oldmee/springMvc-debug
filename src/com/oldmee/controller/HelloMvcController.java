package com.oldmee.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloMvcController {

    @RequestMapping("hello/mvc")
    public String helloMvc() {
        System.out.println("hello");
        return "home";
    }
}
