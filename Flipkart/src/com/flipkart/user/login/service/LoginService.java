package com.flipkart.user.login.service;

import com.flipkart.user.login.model.User;

public interface LoginService {
    public User getLoginUserById(int i) throws Exception;
    public User getLoginUserByNameId(String name, int id) throws Exception;
}
