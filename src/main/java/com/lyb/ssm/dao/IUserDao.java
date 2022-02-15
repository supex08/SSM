package com.lyb.ssm.dao;

import com.lyb.ssm.model.User;

public interface IUserDao {
    User selectUser(long id);
}
