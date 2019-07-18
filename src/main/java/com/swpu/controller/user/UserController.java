package com.swpu.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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


}