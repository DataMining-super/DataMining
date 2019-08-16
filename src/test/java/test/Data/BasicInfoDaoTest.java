package test.Data;

import com.swpu.mapper.BasicInfoDao;
import com.swpu.pojo.Area;
import com.swpu.pojo.BasicData;
import com.swpu.pojo.Visitor;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.BasicTest;

import java.util.List;

/**
 * 描述:
 * 数据查询测试
 *
 * @author ace-huang
 * @create 2019-08-15 4:37 PM
 */
public class BasicInfoDaoTest extends BasicTest {


    @Autowired
     private  BasicInfoDao basicInfoDao;

    @Test
    @Ignore
    public void queryDataListTest(){
        System.out.println(basicInfoDao.queryDataCount());
        List<BasicData> list = basicInfoDao.queryDataList(1,10);
        for ( BasicData basicData: list
             ) {
            System.out.print(basicData.getBasicId() + " ");
            System.out.print(basicData.getInvadeTime()+ " ");
            System.out.println(basicData.getInvaMethod() + " ");
        }
        System.out.println(list.size());
    }

    @Test
    @Ignore
    public void invaderInfoTest(){
        List<Visitor> visitors = basicInfoDao.invaderInfo();
        for (Visitor v : visitors) {
            System.out.println(v.getVisitorId() + " " + v.getCount());
        }
    }

    @Test
    public void queryAreaTest(){
        List<Area> areas = basicInfoDao.queryArea();
        System.out.println(areas.size());
    }


}