package com.swpu.controller.file;

import com.swpu.pojo.UploadMapping;
import com.swpu.pojo.Users;
import com.swpu.service.BasicInfoService;
import com.swpu.service.UploadService;
import com.swpu.util.FileUtil;
import com.swpu.util.SystemCall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
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

    @Autowired
    private UploadService uploadService;

    @RequestMapping(value = "/upload")
    @ResponseBody
    private Map<String,Object> uploadExcel(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> modelMap = new HashMap<>();
        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest)request;

        MultipartFile file = multipartHttpServletRequest.getFile("file");
        try{
            basicInfoService.uploadExcel(file);

            //--------------------编辑shell命令， 获取文件绝对路径
            String absoluteFilePath = file.getOriginalFilename();
            String sh = FileUtil.sh + absoluteFilePath;
            // 系统调用 同步调用
            SystemCall.call(sh);

            // 保存上传记录
            Users currentUser = (Users) request.getSession().getAttribute("currentUser");
            Integer userId = currentUser.getUserId();
            uploadService.addUpload(userId, absoluteFilePath);
            modelMap.put("success",true);
        }catch (Exception e){
            modelMap.put("success",false);
        }
        return modelMap;
    }

    @RequestMapping("/queryUpload")
    public Map<String, Object> queryUpload(HttpServletRequest request) {
        Map<String, Object> modelMap = new HashMap<>();
        List<UploadMapping> uploadMapper;
        try {
            Users currentUser = (Users) request.getSession().getAttribute("currentUser");
            Integer userId = currentUser.getUserId();
            uploadMapper = uploadService.queryUpload(userId);
        } catch (Exception e) {
            modelMap.put("success", false);
            return modelMap;
        }
        modelMap.put("success", true);
        modelMap.put("upload", uploadMapper);
        return modelMap;

    }

}