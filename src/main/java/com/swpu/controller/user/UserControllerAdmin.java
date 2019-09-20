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


    //后加
    @RequestMapping(value = "/contentupload")
    public String contentUpload(){
        return "content-upload";
    }

    //后加
    @RequestMapping(value = "/contenthistogram")
    public String contentHistogram(){
        return "content-histogram";
    }

    //后加
    @RequestMapping(value = "/contentbar")
    public String contentBar(){
        return "content-bar";
    }

    //后加
    @RequestMapping(value = "/contenttable")
    public String contentTable(){
        return "content-table";
    }

    //后加
    @RequestMapping(value = "/contentgrid")
    public String contentGrid(){
        return "content-grid";
    }






}
