package com.TJ.demo.service;

import com.TJ.demo.service.impl.getnextsentxtService;
import org.springframework.stereotype.Service;

@Service("getnextsen")
public class getnextsentxt implements getnextsentxtService {
    @Override
    public String getnextsen(String style) {
        return "text1";
    }
}
