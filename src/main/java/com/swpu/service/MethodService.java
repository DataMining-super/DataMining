package com.swpu.service;

import com.swpu.pojo.Method;

import java.util.List;

/**
 * @author huang
 */
public interface MethodService {
    /**
     * 查询入侵方式以及对应的数量
     * @return Method list
     */
    List<Method> getMethods();
}
