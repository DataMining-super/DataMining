package com.swpu.controller.user;


import com.swpu.pojo.Users;
import com.swpu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author huang
 */
@Controller
public class UserControllerAdmin {

    @RequestMapping(value = "/index")
    public String showUserList(Model model){
        return "index";
    }
    @RequestMapping(value = "/login")
    public String showUserList(){
        return "logintest";
    }

    @RequestMapping(value = "/register")
    public String register(){
        return "registertest";
    }


}
