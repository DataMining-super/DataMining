package com.swpu.service.impl;

import com.swpu.mapper.BasicInfoDao;
import com.swpu.pojo.BasicInfo;
import com.swpu.service.BasicInfoService;
import com.swpu.util.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 描述:
 * 文件上传的相关逻辑
 *
 * @author ace-huang
 * @create 2019-08-12 5:37 PM
 */
@Service
public class BasicInfoServiceImpl implements BasicInfoService {

    @Autowired
    private BasicInfoDao basicInfoDao;

    @Transactional
    @Override
    public void uploadExcel(HttpServletRequest request, HttpServletResponse response) {

        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest)request;

        MultipartFile file = multipartHttpServletRequest.getFile("file");

        if(file.isEmpty()){
            try{
                throw new Exception("文件为空");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        InputStream in = null;

        try {
            in = file.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            new ExcelUtils().getBankListByExcel(in,file.getOriginalFilename());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}