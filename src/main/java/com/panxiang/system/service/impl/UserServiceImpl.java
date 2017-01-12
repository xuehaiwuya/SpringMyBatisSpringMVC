package com.panxiang.system.service.impl;

import com.panxiang.system.dao.UserDao;
import com.panxiang.system.entities.User;
import com.panxiang.system.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author PanXiang
 * @version 1.0
 * @date 2017-01-11.
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;

    @Override
    public User getUser(long id) {
        return userDao.getUser(id);
    }
}
