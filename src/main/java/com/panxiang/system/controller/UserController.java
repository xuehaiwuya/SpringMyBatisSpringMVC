package com.panxiang.system.controller;

import com.panxiang.system.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by panxiang on 2017-01-03.
 */
@Controller
public class UserController {

    @RequestMapping("/login")
    public String getUser(User User){
        System.out.print(User.getName());
        return "index";
    }
}
