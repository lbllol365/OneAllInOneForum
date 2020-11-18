package com.lbl.forumbackend.service.impl;

import com.lbl.forumbackend.dao.UserDao;
import com.lbl.forumbackend.pojo.User;
import com.lbl.forumbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }
}
