package com.yz.service.impl;

import com.yz.bean.User;
import com.yz.dao.IUserDao;
import com.yz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    public UserServiceImpl(){
        System.out.println("UserServiceImpl 初始化");
    }

    @Autowired
    private IUserDao userDao;

    @Override
    public User findById(int id) {
        System.out.println("UserServiceImpl : " + id);
        return userDao.findById(id);
    }
}
