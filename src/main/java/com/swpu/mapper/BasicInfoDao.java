package com.swpu.mapper;


import com.swpu.pojo.Area;
import com.swpu.pojo.BasicData;
import com.swpu.pojo.Visitor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 基础数据的相关操作
 * @author :acehcl
 */
public interface BasicInfoDao {

//    void insertInfoBatch(List<> list);

    /**
     * 分页查询
     * @param rowIndex 页号
     * @param pageSize 每页的数量
     * @return 信息List
     */
    List<BasicData> queryDataList(@Param("rowIndex") int rowIndex,@Param("pageSize") int pageSize);

    /**
     * 查询信息数量
     * @return 信息数量
     */
    long  queryDataCount();

    /**
     * 获取攻击者信息
     * @return 攻击者List
     */
    List<Visitor> invaderInfo();

    /**
     * 获取区域信息
     * @return 地区List
     */
    List<Area> queryArea();

    /**
     * 查询某天的攻击次数
     * @param month 月
     * @param day 天
     * @return 攻击次数
     */
    int queryDateCount(@Param("month") int month,@Param("day") int day);
}
