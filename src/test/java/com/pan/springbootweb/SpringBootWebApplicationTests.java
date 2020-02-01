package com.pan.springbootweb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.pan.springbootweb.dao.UserJpa;
import com.pan.springbootweb.service.Aa;
import com.pan.springbootweb.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringBootWebApplicationTests {
    @Autowired
    private UserJpa userJpa;
    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
//     String userData=JSON.toJSONString(userJpa.findByUsername("pan@123"));
//        String content = StringEscapeUtils.unescapeJava(JSON.toJSONString(userJpa.findByUsername("pan@123")));
//      JSONObject jsonObject = JSON.parseObject(content);

        JSONArray jsonArray = JSON.parseArray(JSON.toJSONString(userJpa.findByUsername("pan@123")));
        int size =jsonArray.size();
        for (int i =0;i < size;i++){
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            System.out.println(jsonObject.getString("username"));
        }

        System.out.println("=============="+ JSON.toJSONString(userJpa.findByUsername("pan@123")));
//        System.out.println("+++++++++==="+(String) jsonObject.get("username"));

    }

    @Test
    void contextLoads1(){
//        UserService userService = new Aa();
//        System.out.println(userService.findUsername("123"));
//        UserService userService = new UserServiceImpl();


        System.out.println(userService.findUsername("pan@123")+"==================");
        UserService userService =new Aa();
        System.out.println(userService.findUsername("pan@123"));

    }

}
