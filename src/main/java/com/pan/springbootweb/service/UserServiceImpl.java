package com.pan.springbootweb.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.pan.springbootweb.dao.UserJpa;
import com.pan.springbootweb.util.SpringUtil;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String findUsername(String username) {
        UserJpa b = (UserJpa) SpringUtil.getBean("userJpa");
        JSONArray jsonArray = JSON.parseArray(JSON.toJSONString(b.findByUsername(username)));
        int size =jsonArray.size();
        String userData = null;
        for (int i =0;i < size;i++){
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            userData = jsonObject.getString("password");

        }
        return userData;

    }
}
