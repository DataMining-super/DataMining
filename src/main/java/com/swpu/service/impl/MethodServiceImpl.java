package com.swpu.service.impl;

import com.swpu.mapper.MethodDao;
import com.swpu.pojo.Method;
import com.swpu.service.MethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述:
 *
 * @author huang
 * @create 2019-09-28 8:25 PM
 */
@Service
public class MethodServiceImpl implements MethodService {

    @Autowired
    private MethodDao dao;

    @Override
    public List<Method> getMethods() {
        return dao.queryMethod();
    }
}