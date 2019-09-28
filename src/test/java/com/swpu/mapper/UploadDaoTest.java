package com.swpu.mapper;

import com.swpu.pojo.UploadMapping;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.BasicTest;

import java.util.List;

/**
 * 描述:
 *
 * @author huang
 * @create 2019-09-28 2:10 PM
 */
public class UploadDaoTest extends BasicTest {

    @Autowired
    private UploadDao dao;

    @Test
    public void testAddUpload() {
        dao.addUpload(1, "huang.txt");
    }

    @Test
    public void testQueryUpload() {
        List<UploadMapping> upload = dao.queryUpload(1);
        System.out.println(upload);
    }
}