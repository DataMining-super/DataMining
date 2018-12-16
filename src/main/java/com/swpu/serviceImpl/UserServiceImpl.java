package com.swpu.serviceImpl;

import com.swpu.mapper.UserDao;
import com.swpu.pojo.Users;
import com.swpu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao ;

    @Override
    public List<Users> showUserList() {
        return userDao.showUserList();
    }
}
