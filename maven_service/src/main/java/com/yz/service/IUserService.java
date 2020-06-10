package com.yz.service;

import com.yz.bean.User;

public interface IUserService {

    /**
     * 按照id查询
     * @param id
     * @return
     */
    public User findById(int id);
}
