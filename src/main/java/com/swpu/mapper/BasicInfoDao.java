package com.swpu.mapper;


import com.swpu.pojo.Area;
import com.swpu.pojo.BasicData;
import com.swpu.pojo.DataInfo;
import com.swpu.pojo.Visitor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 基础数据的相关操作
 * author：acehcl
 */


public interface BasicInfoDao {

//    void insertInfoBatch(List<> list);

    List<BasicData> queryDataList(@Param("rowIndex") int rowIndex,@Param("pageSize") int pageSize);

    long  queryDataCount();

    List<Visitor> invaderInfo();//攻击者信息
    List<Area> queryArea();//获取区域信息
}
