package com.swpu.mapper;

import com.swpu.pojo.Method;

import java.util.List;

/**
 * 描述:
 *
 * @author huang
 * @create 2019-09-28 7:57 PM
 */
public interface MethodDao {

    /**
     * 查询入侵方式统计信息
     * @return 入侵方式和对应入侵次数 List
     */
    List<Method> queryMethod();
}