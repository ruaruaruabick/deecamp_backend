package com.TJ.demo.controller;



import com.TJ.demo.service.impl.runpyService;
import com.TJ.demo.utils.GsonUtils;
import com.TJ.demo.utils.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Controller
public class UploadGraphController {
    @Resource(name="runpy")
    private runpyService runpyservice;
    @RequestMapping(value="/upbase64",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject uploadbase64(@RequestParam String base64data, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ArrayList<String> temp = runpyservice.runpy("recognize.py");
        String url = "https://aip.baidubce.com/api/v1/solution/direct/imagerecognition/combination";
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("image", base64data.replaceAll(" ","+"));
            List<Object> scenes = new ArrayList<>();
            scenes.add("ingredient");
            scenes.add("plant");
            scenes.add("animal");
            scenes.add("advanced_general");
            scenes.add("logo_search");
            scenes.add("multi_object_detect");
            map.put("scenes", scenes);

            String param = GsonUtils.toJson(map);

            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken = "24.423afa94502b83da9f8c121620a94456.2592000.1630477562.282335-24637773";

            String result = HttpUtil.post(url, accessToken, "application/json", param);
            System.out.println(result);
            JSONObject json_test = JSON.parseObject(result);
            return json_test;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
