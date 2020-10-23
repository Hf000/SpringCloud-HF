package com.hufei.client.fallback;

import com.hufei.client.UserFeignClient;
import com.hufei.entity.pojo.User;
import org.springframework.stereotype.Component;

/**
*@Author:hufei
*@CreateTime:2020-10-23
*@Description:Feign服务降级
*/
@Component
public class UserFeignClientFallback implements UserFeignClient {

    @Override
    public User QueryById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("用户异常");
        return user;
    }
}
