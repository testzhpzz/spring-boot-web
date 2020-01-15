package com.pan.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @ClassName HelloController
 * @Deacription TODO
 * @Author zhihaop
 * @Date 2020/1/9 11:06
 **/
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @RequestMapping("/success")
    public  String success(Map<String,Object> map){
        map.put("hello","您好");
        return "success";
    }
}
