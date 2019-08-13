package com.swpu.controller.file;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述:
 * 文件处理相关url转发
 *
 * @author ace-huang
 * @create 2019-08-12 1:22 PM
 */


@Controller
public class FileHandingControllerAdmin {
    @RequestMapping(value = "/upload")
    public String upload(){return "upload";}
}