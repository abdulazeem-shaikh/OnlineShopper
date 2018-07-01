package com.flipkart.user.login.dao;

import com.flipkart.user.login.model.User;

public interface UserDao {
    public User getUserById(int id) throws Exception;
    public User getUserByNameId(String name, int i) throws Exception;
 }
