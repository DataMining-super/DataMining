package com.swpu.dto;

import com.swpu.enums.UserStateEnum;
import com.swpu.pojo.Users;

import java.util.List;

/**
 * 描述:
 * 对用户操作结果的封装
 *
 * @author ace-huang
 * @create 2019-07-19 3:27 PM
 */
public class UserExecution {

    //结果的状态
    private int state;

    //状态信息
    private String stateInfo;

    //普通用户的数量
    private int count;

    private Users user;

    //获取用户的列表
    private List<Users> usersList;


    public UserExecution(){

    }
    //失败的构造器
    public UserExecution(UserStateEnum stateEnum){
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }
    //成功的构造器
    public UserExecution(UserStateEnum stateEnum,Users user){
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.user = user;
    }
    //成功的构造器
    public UserExecution(UserStateEnum stateEnum,List<Users> usersList){
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.usersList = usersList;
    }


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }
}