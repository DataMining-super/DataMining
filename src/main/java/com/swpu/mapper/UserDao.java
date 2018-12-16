package com.swpu.mapper;

import com.swpu.pojo.Users;

import java.util.List;


/**
 * @author huang
 */
public interface UserDao {
    /**
     * 查询users
     * @return 用户列表
     */

    List<Users> showUserList();
}
