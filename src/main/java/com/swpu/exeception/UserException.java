package com.swpu.exeception;

/**
 * 描述:
 * 用户操作相关的异常
 *
 * @author ace-huang
 * @create 2019-07-19 3:51 PM
 */
public class UserException extends Exception {

    private String message;

    public UserException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}