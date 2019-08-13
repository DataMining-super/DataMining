package com.swpu.controller.file;

import com.swpu.service.BasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    private void uploadExcel(HttpServletRequest request, HttpServletResponse response){
        basicInfoService.uploadExcel(request, response);
    }


}