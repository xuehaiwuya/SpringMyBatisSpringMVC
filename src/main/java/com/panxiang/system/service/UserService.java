package com.panxiang.system.service;

import com.panxiang.system.entities.User;
import org.springframework.stereotype.Service;

/**
 * Created by panxiang on 2017-01-03.
 */
@Service
public interface UserService {
    User getUser(long id);
}
