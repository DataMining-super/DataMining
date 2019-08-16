package test.Data;

import com.swpu.dto.AreaExecution;
import com.swpu.dto.DataExecution;
import com.swpu.enums.DataStateEnum;
import com.swpu.service.BasicInfoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.BasicTest;

/**
 * 描述:
 * service
 *
 * @author ace-huang
 * @create 2019-08-15 7:49 PM
 */
public class BasicService extends BasicTest {


    @Autowired
    private BasicInfoService basicInfoService;

    @Test
    public void queryDataList() {
        DataExecution dataExecution = basicInfoService.queryDataList(1, 10);
        System.out.println(dataExecution.getCount());
        System.out.println(dataExecution.getState());
        System.out.println(dataExecution.getStateInfo());
        System.out.println(dataExecution.getBasicDataList().size());
    }

    @Test
    public void queryAreaList() {
        AreaExecution areaExecution = basicInfoService.queryArea();
        System.out.println(areaExecution.getAreaList().size());
    }
}