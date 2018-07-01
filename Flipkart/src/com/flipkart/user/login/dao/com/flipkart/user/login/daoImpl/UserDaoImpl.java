package com.flipkart.user.login.dao.com.flipkart.user.login.daoImpl;

import com.flipkart.user.login.dao.UserDao;
import com.flipkart.user.login.model.User;

public class UserDaoImpl implements UserDao {

    @Override
    public User getUserById(int id) throws Exception {
        return new User(10,"abdulazeem");
    }

    @Override
    public User getUserByNameId(String name, int i) throws Exception {
       return  new User(10,"name");
     }

}
