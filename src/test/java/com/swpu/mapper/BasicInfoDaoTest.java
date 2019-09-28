package com.swpu.mapper;

import com.swpu.pojo.DateMapping;
import test.BasicTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
        List<DateMapping> dateMappings = dao.queryDateCount(2018, 5);
        System.out.println(dateMappings);
    }
}