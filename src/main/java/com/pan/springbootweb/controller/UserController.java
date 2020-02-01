package com.pan.springbootweb.controller;


import com.pan.springbootweb.dao.UserEntity;
import com.pan.springbootweb.dao.UserJpa;
import com.pan.springbootweb.service.UserService;
import com.pan.springbootweb.service.UserServiceImpl;

import com.pan.springbootweb.util.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
@Controller
public class UserController {
    @Autowired
    private UserJpa userJpa;
    @Resource
    private UserService userService;
    //查询所有用户信息
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.GET)
        public List<UserEntity> userList(){
        return userJpa.findAll();


    }
    //根据用户名查询密码
    @ResponseBody
    @RequestMapping(value = "/username",method = RequestMethod.GET)
    public String findUsername(String username){
//        String userData=new UserServiceImpl().findUsername(username);
//        return userData;
//        UserService userService = new UserServiceImpl();
//        return userService.findUsername(username);
//        UserService b = (UserService) SpringUtil.getBean("userService");
        return userService.findUsername(username);

    }


}
