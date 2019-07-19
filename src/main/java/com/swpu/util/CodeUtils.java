package com.swpu.util;

import com.google.code.kaptcha.Constants;

import javax.servlet.http.HttpServletRequest;

/**
 * 描述:
 * 对验证码进行操作
 *
 * @author ace-huang
 * @create 2019-07-18 5:27 PM
 */
public class CodeUtils {

    public static boolean checkVerifyCode(HttpServletRequest request){

        String verifyCodeExpected = (String)request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
        String verifyCodeActual = HttpServletRequestUtil.getString(request,"verifyCodeActual");
        if(verifyCodeActual == null || !verifyCodeExpected.equalsIgnoreCase(verifyCodeActual))
            return true;//暂时设置都为true
        return true;

    }

}