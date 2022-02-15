package com.lyb.ssm.service.impl;

import com.lyb.ssm.dao.IUserDao;
import com.lyb.ssm.model.User;
import com.lyb.ssm.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public User selectUser(long userId) {
        return userDao.selectUser(userId);
    }
}
