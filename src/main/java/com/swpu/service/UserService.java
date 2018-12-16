package com.swpu.service;

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
}
