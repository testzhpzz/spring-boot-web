package com.pan.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @ClassName loginController
 * @Deacription TODO
 * @Author zhihaop
 * @Date 2020/1/14 20:25
 **/
@Controller

public class loginController {
    @Resource
    private UserController userController;
    @PostMapping(value = "/index")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Map<String, Object> map) {
        if (null == username || !password.equals(userController.findUsername(username)) ){
            map.put("msg","登陆密码输入错误！");
            return "login";

        } else {
          return "redirect:/index.html";
        }
    }
}
