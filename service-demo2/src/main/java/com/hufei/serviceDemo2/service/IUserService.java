package com.hufei.serviceDemo2.service;

import com.hufei.serviceDemo2.entity.User;

/**
 * @Author:hufei
 * @CreateTime:2020-09-15
 * @Description:用户service接口
 */
public interface IUserService {

    User queryUserById(Long id);

}
