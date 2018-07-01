package com.flipkart.user.login.serviceImpl;

import com.flipkart.user.login.dao.UserDao;
import com.flipkart.user.login.model.User;
import com.flipkart.user.login.service.LoginService;

public class LoginServiceImpl implements LoginService {

    UserDao userDao;

    @Override
    public User getLoginUserById(int i) throws Exception {
        return userDao.getUserById(i);
    }

    @Override
    public User getLoginUserByNameId(String name, int id) throws Exception{
        return userDao.getUserByNameId(name,id);
    }
}
