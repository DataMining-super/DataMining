package com.swpu.mapper;

import com.swpu.pojo.Method;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.BasicTest;

import java.util.List;

/**
 * 描述:
 *
 * @author huang
 * @create 2019-09-28 8:10 PM
 */
public class MethodDaoTest extends BasicTest {

    @Autowired
    private MethodDao dao;

    @Test
    public void testQueryAffiliation() {
        List<Method> methods = dao.queryMethod();
        System.out.println(methods);
    }

}