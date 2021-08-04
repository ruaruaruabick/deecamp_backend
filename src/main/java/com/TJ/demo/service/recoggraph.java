package com.TJ.demo.service;

import com.TJ.demo.service.impl.recoggraphService;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Service("recog")
public class recoggraph implements recoggraphService {

    @Override
    public String recog(String base64) {

        return "result1";
    }
}
