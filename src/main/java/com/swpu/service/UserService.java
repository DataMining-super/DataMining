package com.swpu.service;

import com.swpu.dto.UserExecution;
import com.swpu.dto.VisitorExecution;
import com.swpu.exeception.UserException;
import com.swpu.pojo.Users;

import java.util.List;

/**
 * @author huang
 */
public interface UserService {

    /**
     * 查询users
     * @return 用户列表
     */
    List<Users> showUserList();

    /**
     * 通过user注册店铺，UserExecution封装返回的信息
     * @param user
     * @return
     * @throws RuntimeException
     */
    UserExecution registerUser(Users user)throws UserException;

    /**
     * 通过用户名查询用户信息
     * @param user
     * @return
     * @throws UserException
     */
    UserExecution userLogin(Users user)throws UserException;

    boolean changeUserPassword(Users user, String password);
}


