package com.hufei.controller;

import com.hufei.entity.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:hufei
 * @CreateTime:2020-09-16
 * @Description:用户处理器
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{id}")
    public User queryUserById(@PathVariable Long id){
        String url = "http://localhost:8083/user/"+id;
        return restTemplate.getForObject(url, User.class);
    }
}
