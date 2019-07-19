package com.swpu.service.impl;

import com.swpu.dto.UserExecution;
import com.swpu.enums.UserStateEnum;
import com.swpu.exeception.UserException;
import com.swpu.mapper.UserDao;
import com.swpu.pojo.Users;
import com.swpu.service.UserService;
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

    @Override
    public UserExecution registerUser(Users user) throws UserException {

        if(user == null){
            return new UserExecution(UserStateEnum.NULL_INFO);
        }
        user.setIdentity("普通管理员");//0 普通管理员 1 超级管理员
        user.setLocalAuth(0);
        try{
            //判断影响的结果行数
            int effectNum = userDao.registerUser(user);
           if(effectNum > 0){
               return new UserExecution(UserStateEnum.REGISTER_SUCCESS,user);
           }else {
               throw new UserException("用户信息插入失败");
           }
        } catch (UserException e) {
            throw new UserException("用户信息插入失败");
        }
    }
}
