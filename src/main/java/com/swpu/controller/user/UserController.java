package com.swpu.controller.user;

import com.swpu.dto.UserExecution;
import com.swpu.enums.UserStateEnum;
import com.swpu.exeception.UserException;
import com.swpu.pojo.Users;
import com.swpu.service.UserService;
import com.swpu.util.CodeUtils;
import com.swpu.util.DESUtils;
import com.swpu.util.HttpServletRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述:
 * 用户注册，登陆等请求的处理
 *
 * @author ace-huang
 * @create 2019-07-18 5:40 PM
 */
@Controller()
@RequestMapping(value = "/user",method = {RequestMethod.GET,RequestMethod.POST})
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 注册用户
     * @param request
     * @return
     */
    @RequestMapping(value = "/register")
    @ResponseBody
    private Map<String,Object> registerUser(HttpServletRequest request){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        if ((Boolean) CodeUtils.checkVerifyCode(request)){

            Users user = new Users();
            String md5password = DESUtils.getEncryptString(HttpServletRequestUtil.getString(request,"password"));
            String checkmd5password = DESUtils.getEncryptString(HttpServletRequestUtil.getString(request,"checkpassword"));
            String username = HttpServletRequestUtil.getString(request,"username");
            if (md5password == null || md5password.length() == 0 || username==null || username.length() == 0 || checkmd5password == null || checkmd5password.length() == 0){
                modelMap.put("success", false);
                return modelMap;
            }
            if (md5password.equals(checkmd5password)){
                user.setPassword(md5password);
                user.setUsername(username);
                try {
                    UserExecution userException = userService.registerUser(user);
                    if(userException.getState() == UserStateEnum.REGISTER_SUCCESS.getState()){

                        //增加成功的modelmap信息
                        modelMap.put("success",true);
                        modelMap.put("message","注册成功");
                        return modelMap;
                    }else if(userException.getState() == UserStateEnum.REGISTER_ERROR.getState()){
                        //用户名存在的相关信息
                        modelMap.put("success",false);
                        modelMap.put("message","用户已存在");
                    }else{

                        //增加失败的modelmap信息
                        modelMap.put("success", false);
                        modelMap.put("message","注册失败");
                    }

                } catch (UserException e) {
                    modelMap.put("success",false);
                    modelMap.put("message","注册失败");
                    e.printStackTrace();
                }finally {
                    return modelMap;
                }
            }
        }
        //验证码错误
        modelMap.put("success", false);
        return modelMap;
    }

    /**
         * 更改密码
         * @param request
         * @param newPassword
         * @return
         */
        @RequestMapping(value = "/updatePassword")
        @ResponseBody
        private Map<String, Object> updatePassword(HttpServletRequest request, String newPassword) {
            Map<String, Object> modelMap = new HashMap<>();
            if (CodeUtils.checkVerifyCode(request)) {
                Users user = new Users();
                String md5password = DESUtils.getEncryptString(HttpServletRequestUtil.getString(request, "password"));
                String username = HttpServletRequestUtil.getString(request, "username");
                if (md5password == null || md5password.length() == 0 || username==null || username.length() == 0){
                    modelMap.put("success", false);
                    return modelMap;
                }
                user.setPassword(md5password);
                user.setUsername(username);
                boolean result = userService.changeUserPassword(user, newPassword);
                if (result) {
                    //增加成功的modelMap信息
                    modelMap.put("success", true);
                    return modelMap;
                } else {
                    //增加失败的modelMap信息
                    modelMap.put("success", false);
                }

            }
        //验证码错误
        modelMap.put("success",false);
        modelMap.put("message","注册失败");
        return modelMap;
    }


    @RequestMapping(value = "/login")
    @ResponseBody
    private Map<String,Object> userLogin(HttpServletRequest request){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        if ((Boolean) CodeUtils.checkVerifyCode(request)){
            Users user = new Users();
            user.setUsername(HttpServletRequestUtil.getString(request,"username"));
            user.setPassword(HttpServletRequestUtil.getString(request,"password"));
            try {
                UserExecution userException = userService.userLogin(user);
                if(userException.getState() == UserStateEnum.LOGIN_SUCCESS.getState()){
                    Users currentUser = new Users();
                    currentUser.setLocalAuth(user.getLocalAuth());
                    request.getSession().setAttribute("currentUser",currentUser);
                    //增加成功的modelmap信息
                    modelMap.put("success",true);
                    modelMap.put("message","登陆成功");
                    return modelMap;
                }else if(userException.getState() == UserStateEnum.LOGIN_ERROR.getState()){
                    //密码错误
                    modelMap.put("success",false);
                    modelMap.put("message","密码错误");
                }else{
                    //信息为空
                    modelMap.put("success",false);
                    modelMap.put("message","信息为空");
                }
                //增加失败的modelmap信息
            } catch (UserException e) {
                modelMap.put("success",false);
                modelMap.put("message","登陆失败");
                e.printStackTrace();
            }
            return modelMap;
        }
        //验证码错误
        modelMap.put("success",false);
        modelMap.put("message","验证码错误");
        return modelMap;
    }


}