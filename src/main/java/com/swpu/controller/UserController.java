package com.swpu.controller;


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
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/")
    public String showUserList(Model model){

        List<Users> users = userService.showUserList();

        model.addAttribute("users",users);

        return "index";
    }

}
