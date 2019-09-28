package com.swpu.controller.data;

import com.swpu.dto.AreaExecution;
import com.swpu.dto.DataExecution;
import com.swpu.dto.VisitorExecution;
import com.swpu.enums.AreaStateEnum;
import com.swpu.enums.DataStateEnum;
import com.swpu.enums.VisitorStateEnum;
import com.swpu.pojo.DateMapping;
import com.swpu.pojo.Method;
import com.swpu.service.BasicInfoService;
import com.swpu.service.MethodService;
import com.swpu.util.HttpServletRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 数据请求处理相关的操作
 *
 * @author ace-huang
 * @create 2019-08-15 7:37 PM
 */

@RestController
@RequestMapping(value = "/data", method = RequestMethod.POST)
public class DataController {

    @Autowired
    private BasicInfoService basicInfoService;

    @Autowired
    private MethodService methodService;

    @RequestMapping(value = "/querydatalist")
    public Map<String, Object> queryDataList(HttpServletRequest request, HttpServletResponse response) {


        int pageIndex = HttpServletRequestUtil.getInt(request, "pageIndex");
        int pageSize = HttpServletRequestUtil.getInt(request, "pageSize");
        Map<String, Object> modelMap = new HashMap<>();
        try {
            DataExecution dataExecution = basicInfoService.queryDataList(pageIndex, pageSize);
            if (dataExecution.getState() == DataStateEnum.QUERY_SUCCESS.getState()) {
                modelMap.put("success", true);
                modelMap.put("count", dataExecution.getCount());
                modelMap.put("datalist", dataExecution.getBasicDataList());
            } else if (dataExecution.getState() == DataStateEnum.FULL.getState()) {
                modelMap.put("success", false);
                modelMap.put("message", DataStateEnum.FULL.getStateInfo());
            }
        } catch (Exception e) {
            modelMap.put("success", false);
            modelMap.put("message", DataStateEnum.QUERY_FAILED);
            e.printStackTrace();
        }
        return modelMap;
    }

    @RequestMapping(value = "queryTenInvader")
    public Map<String, Object> queryTenInvader(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> modelMap = new HashMap<>();
        try {
            VisitorExecution visitorExecution = basicInfoService.queryTenRecord();
            if (visitorExecution.getState() == VisitorStateEnum.FULL.getState()) {
                modelMap.put("success", false);
                modelMap.put("message", VisitorStateEnum.FULL.getStateInfo());
            } else if (visitorExecution.getState() == VisitorStateEnum.QUERY_SUCCESS.getState()) {
                modelMap.put("success", true);
                modelMap.put("visitors", visitorExecution.getVisitors());
            }
        } catch (Exception e) {
            modelMap.put("success", false);
            modelMap.put("message", VisitorStateEnum.QUERY_FAILED);
            e.printStackTrace();
        }
        return modelMap;
    }


    @RequestMapping(value = "queryArea")
    public Map<String, Object> queryArea(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> modelMap = new HashMap<>();
        try {
            AreaExecution areaExecution = basicInfoService.queryArea();
            if (areaExecution.getState() == AreaStateEnum.FULL.getState()) {
                modelMap.put("success", false);
                modelMap.put("message", AreaStateEnum.FULL.getStateInfo());
            } else if (areaExecution.getState() == AreaStateEnum.QUREY_SUCCESS.getState()) {
                modelMap.put("success", true);
                modelMap.put("visitors", areaExecution.getAreaList());
            }
        } catch (Exception e) {
            modelMap.put("success", false);
            modelMap.put("message", AreaStateEnum.QUERY_FAILD);
            e.printStackTrace();
        }
        return modelMap;
    }

    @RequestMapping(value = "dateCount", method = RequestMethod.GET)
    public Map<String, Object> dataCount(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> modelMap = new HashMap<>();

        int month;
        int year;
        try {
            month = Integer.parseInt(request.getParameter("month"));
            year = Integer.parseInt(request.getParameter("year"));
        } catch (Exception e) {
            modelMap.put("success", false);
            modelMap.put("message", "缺失参数");
            return modelMap;
        }

        List<DateMapping> dateMappings = basicInfoService.dateCount(year, month);

        modelMap.put("success", true);
        modelMap.put("day_count", dateMappings);
        return modelMap;
    }

    @RequestMapping(value = "methodCount", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> methodCount() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Method> methods = null;
        try {
            methods = methodService.getMethods();
        } catch (Exception e) {
            e.printStackTrace();
            modelMap.put("success", false);
        }
        modelMap.put("success", true);
        modelMap.put("methods", methods);
        return modelMap;
    }

}