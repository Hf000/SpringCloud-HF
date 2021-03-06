package com.hufei.service.impl;

import com.hufei.entity.User;
import com.hufei.mapper.UserMapper;
import com.hufei.service.IUserService;
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
