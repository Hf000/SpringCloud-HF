package com.hufei.serviceDemo2.service.impl;

import com.hufei.serviceDemo2.entity.User;
import com.hufei.serviceDemo2.mapper.UserMapper;
import com.hufei.serviceDemo2.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:hufei
 * @CreateTime:2020-09-15
 * @Description:用户service接口实现类
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

}
