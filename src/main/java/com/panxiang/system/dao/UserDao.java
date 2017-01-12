package com.panxiang.system.dao;

import com.panxiang.system.entities.User;

/**
 * Created by panxiang on 2017-01-03.
 */
public interface UserDao {
    User getUser(long id);
    int saveUser(User user);
    int updateUser(User user);
    int deleteUser(User user);
}
