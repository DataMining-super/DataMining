package com.swpu.service;

import com.swpu.pojo.UploadMapping;

import java.util.List;

public interface UploadService {

    void addUpload(int userId, String fileName, String size);

    List<UploadMapping> queryUpload(int userId);

}
