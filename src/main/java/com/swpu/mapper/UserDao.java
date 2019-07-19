package com.swpu.mapper;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
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

    List<Users> showUserList();//test


    /**
     * 通过user注册用户的信息
     * @param user
     * @return
     */
    int insertByUser(Users user);

    Users queryByUsername(Users user);


}
