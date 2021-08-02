package com.TJ.demo.controller;

import com.TJ.demo.service.impl.getnextsentxtService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;

@Controller
public class GetNextSenController {
    @Resource(name="getnextsen")
    private getnextsentxtService getnextsentxtservice;
    @RequestMapping("/getnextsen")
    @ResponseBody
    public String getnextsen(@RequestParam(name="style",required = false) String style){

        return getnextsentxtservice.getnextsen(style);
    }
}
