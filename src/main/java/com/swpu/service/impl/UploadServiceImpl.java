package com.swpu.service.impl;

import com.swpu.mapper.UploadDao;
import com.swpu.pojo.UploadMapping;
import com.swpu.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述:
 *
 * @author huang
 * @create 2019-09-28 2:16 PM
 */
@Service
public class UploadServiceImpl implements UploadService {

    @Autowired
    private UploadDao dao;

    @Override
    public void addUpload(int userId, String fileName, String size) {
        dao.addUpload(userId, fileName, size);
    }

    @Override
    public List<UploadMapping> queryUpload(int userId) {
        return dao.queryUpload(userId);
    }
}