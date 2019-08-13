package com.swpu.service.impl;

import com.swpu.dto.UserExecution;
import com.swpu.enums.UserStateEnum;
import com.swpu.exeception.UserException;
import com.swpu.mapper.UserDao;
import com.swpu.pojo.Users;
import com.swpu.service.UserService;
import com.swpu.util.DESUtils;
import com.swpu.util.MD5;
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

        if (user == null) {
            return new UserExecution(UserStateEnum.NULL_INFO);
        }
        try {
            Users resultUser = userDao.queryByUsername(user);
            if(resultUser == null){
                user.setIdentity("普通管理员");//0 普通管理员 1 超级管理员
                user.setLocalAuth(0);
                //判断影响的结果行数
                int effectNum = userDao.insertByUser(user);
                if (effectNum <= 0) {
                    throw new UserException("用户信息插入失败");

                } else {
                    return new UserExecution(UserStateEnum.REGISTER_SUCCESS, user);
                }
            }
        } catch (UserException e) {
            throw new UserException("用户信息插入失败");
        }finally {
            return new UserExecution(UserStateEnum.REGISTER_ERROR);
        }

    }

    /**
     * 登陆验证
     * @param user
     * @return
     * @throws UserException
     */
    @Override
    public UserExecution userLogin(Users user) throws UserException {

        if(user != null&&user.getUsername()!=null&&user.getPassword()!=null){
            Users resultUser = userDao.queryByUsername(user);
            if(resultUser != null){
                String passwordActual = DESUtils.getEncryptString(user.getPassword());
                if(resultUser.getPassword().equals(passwordActual)){
                    return new UserExecution(UserStateEnum.LOGIN_SUCCESS,resultUser);
                }
                return new UserExecution(UserStateEnum.LOGIN_ERROR);
            }

        }
        return new UserExecution(UserStateEnum.NULL_INFO);
    }
}
