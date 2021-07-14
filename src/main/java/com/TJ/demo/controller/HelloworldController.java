package com.TJ.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloworldController {
    @RequestMapping("/")
    @ResponseBody
    public String helloworld(){
        return "hello world！";
    }
}
