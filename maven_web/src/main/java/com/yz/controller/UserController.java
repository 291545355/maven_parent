package com.yz.controller;

import com.yz.bean.User;
import com.yz.service.IUserService;
import com.yz.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/users")
public class UserController {

    public UserController(){
        System.out.println("UserController 初始化");
    }

    @Autowired
    private IUserService userService;

    @RequestMapping("/findId")
    @ResponseBody
    public User findById(int id){
        User user = userService.findById(id);
        System.out.println("id查询到的数据 : " + user);
        System.out.println("user : " + user);
        return user;
    }
}
