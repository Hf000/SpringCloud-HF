package com.hufei.controller;

import com.hufei.client.UserFeignClient;
import com.hufei.entity.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
*@Author:hufei
*@CreateTime:2020-10-23
*@Description:Feign的处理器
*/
@RestController
@RequestMapping("/userFeign")
public class UserFeignController {

    @Autowired          //注入Feign客户端
    private UserFeignClient userFeignClient;

    @GetMapping("/{id}")
    public User queryById(@PathVariable Long id){
        return userFeignClient.QueryById(id);
    }

}
