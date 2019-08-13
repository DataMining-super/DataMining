package com.swpu.mapper;


import com.swpu.pojo.BasicInfo;

import java.util.List;

/**
 * 基础数据的相关操作
 * author：acehcl
 */


public interface BasicInfoDao {

    void insertInfoBatch(List<BasicInfo> list);

}
