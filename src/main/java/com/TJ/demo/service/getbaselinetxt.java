package com.TJ.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import com.TJ.demo.service.impl.getbaselinetxtService;
import com.TJ.demo.entity.baselinetxt;
@Service("getbaseline")
public class getbaselinetxt implements getbaselinetxtService {
    baselinetxt result;
    @Override
    public ArrayList<String> getbasetxt(String style){
        ArrayList<String> testresult = new ArrayList<>();
        testresult.add("text1");
        testresult.add("text2");
        testresult.add("text3");
        result = new baselinetxt(testresult);
        return result.gettxt();

    }
}
