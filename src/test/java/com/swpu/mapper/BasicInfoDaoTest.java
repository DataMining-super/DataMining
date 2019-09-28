package com.swpu.mapper;

import test.BasicTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

/**
 * 描述:
 *
 * @author huang
 * @create 2019-09-28 11:12 AM
 */
public class BasicInfoDaoTest extends BasicTest {

    @Autowired
    BasicInfoDao dao;

    @Test
    public void testQueryDateCount() {
        int count = dao.queryDateCount(5, 31);
        assertEquals(count, 17);
    }
}