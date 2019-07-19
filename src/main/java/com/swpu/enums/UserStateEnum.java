package com.swpu.enums;

/**
 * 用户操作过程中的一些枚举常数
 */
public enum UserStateEnum {

    REGISTER_SUCCESS(0,"注册成功"),ERROR(-1,"注册失败"),LOGIN_SUCCESS(1,"登陆成功"),
    NULL_INFO(2,"注册信息空值");
    private int state;
    private String stateInfo;



    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    UserStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }
}
