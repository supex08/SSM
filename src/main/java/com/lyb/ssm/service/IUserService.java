package com.lyb.ssm.service;

import com.lyb.ssm.model.User;

public interface IUserService {
    public User selectUser(long userId);
}
