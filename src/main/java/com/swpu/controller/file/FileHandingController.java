package com.swpu.controller.file;

import com.swpu.service.BasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述:
 * 文件处理相关操作
 *
 * @author ace-huang
 * @create 2019-08-12 1:23 PM
 */
@Controller
@RequestMapping(value = "/file")
public class FileHandingController {

    @Autowired
    private BasicInfoService basicInfoService;

    @RequestMapping(value = "/upload")
    @ResponseBody
    private Map<String,Object> uploadExcel(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> modelMap = new HashMap<>();
        try{
            basicInfoService.uploadExcel(request, response);
            modelMap.put("success",true);
        }catch (Exception e){
            modelMap.put("success",false);
        }
        return modelMap;
    }


}