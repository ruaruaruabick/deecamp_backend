package com.TJ.demo.service;

import com.TJ.demo.service.impl.runpyService;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

@Service("runpy")
public class runpy implements runpyService {

    @Override
    public ArrayList<String> runpy(String base64) {
        try {
            String exe = "C:\\Users\\99349\\Anaconda3\\python.exe ";
            String directoryName = System.getProperty("user.dir") + "/src/main/java/com/TJ/demo/utils/"+base64;
            String cmdArr = exe+directoryName ;
            Process process = Runtime.getRuntime().exec(cmdArr);
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            ArrayList<String> result = new ArrayList<>();
            while( ( line = in.readLine() ) != null ) {
                result.add(line);
            }
            in.close();
            return  result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
