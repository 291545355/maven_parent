package com.yz.dao;

import com.yz.bean.User;

public interface IUserDao {

    /**
     * 按照id查询
     * @param id
     * @return
     */
    public User findById(int id);
}
