package com.swpu.service;

import com.swpu.mapper.UserDao;
import com.swpu.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author huang
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao ;

    @Override
    public List<Users> showUserList() {
        return userDao.showUserList();
    }
}
