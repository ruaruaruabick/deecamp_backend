package com.TJ.demo.controller;

import com.TJ.demo.service.impl.getbaselinetxtService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;

@Controller
public class getbaselinecontroller {
    @Resource(name="getbaseline")
    private getbaselinetxtService getbaselinetxtservice;
    @RequestMapping("/getbaseline")
    @ResponseBody
    public ArrayList<String> getbaseline(){

        return getbaselinetxtservice.getbasetxt();
    }
}
