package com.swpu.service.impl;

import com.swpu.dto.AreaExecution;
import com.swpu.dto.DataExecution;
import com.swpu.dto.VisitorExecution;
import com.swpu.enums.AreaStateEnum;
import com.swpu.enums.DataStateEnum;
import com.swpu.enums.VisitorStateEnum;
import com.swpu.mapper.BasicInfoDao;
import com.swpu.pojo.Area;
import com.swpu.pojo.BasicData;
import com.swpu.pojo.Visitor;
import com.swpu.service.BasicInfoService;
import com.swpu.util.ExcelUtils;
import com.swpu.util.PageCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 描述:
 * 文件上传的相关逻辑
 *
 * @author ace-huang
 * @create 2019-08-12 5:37 PM
 */
@Service
public class BasicInfoServiceImpl implements BasicInfoService {

    @Autowired
    private BasicInfoDao basicInfoDao;

    @Transactional
    @Override
    public void uploadExcel(HttpServletRequest request, HttpServletResponse response) {

        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest)request;

        MultipartFile file = multipartHttpServletRequest.getFile("file");

        if(file.isEmpty()){
            try{
                throw new Exception("文件为空");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        InputStream in = null;

        try {
            in = file.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            new ExcelUtils().getBankListByExcel(in,file.getOriginalFilename());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param pageIndex 页数，根据需要的页面计算
     * @param pageSize 每页的的数量
     * @return
     */
    @Override
    public DataExecution queryDataList(int pageIndex, int pageSize) {
        int rowIndex = PageCalculator.calculateRowIndex(pageIndex,pageSize);//计算起始行
        DataExecution dataExecution = new DataExecution();//处理的结果的返回
        try{
            List<BasicData> list = basicInfoDao.queryDataList(rowIndex,pageSize);
            long count = basicInfoDao.queryDataCount();
            if(list == null || list.size() == 0){
                dataExecution.setState(DataStateEnum.FULL.getState());
                dataExecution.setStateInfo(DataStateEnum.FULL.getStateInfo());
            }

            dataExecution.setState(DataStateEnum.QUERY_SUCCESS.getState());
            dataExecution.setBasicDataList(list);
            dataExecution.setCount(count);
            dataExecution.setStateInfo(DataStateEnum.QUERY_SUCCESS.getStateInfo());
        }catch (Exception e){
            dataExecution.setState(DataStateEnum.QUERY_FAILED.getState());
            e.printStackTrace();
        }
        return dataExecution;
    }

    /**
     * 获取攻击前十的攻击者信息
     * @return
     */
    @Override
    public VisitorExecution queryTenRecord() {
        VisitorExecution visitorExecution = new VisitorExecution();
        try {
            List<Visitor> visitors = basicInfoDao.invaderInfo();//获取前十攻击者
            if(visitors == null || visitors.size() == 0){
                visitorExecution.setState(VisitorStateEnum.FULL.getState());
                visitorExecution.setStateInfo(VisitorStateEnum.FULL.getStateInfo());

            }else{
                visitorExecution.setState(VisitorStateEnum.QUERY_SUCCESS.getState());
                visitorExecution.setStateInfo(VisitorStateEnum.QUERY_SUCCESS.getStateInfo());
                visitorExecution.setVisitors(visitors);
            }
        }catch (Exception e) {
            visitorExecution.setState(VisitorStateEnum.QUERY_FAILED.getState());
            visitorExecution.setStateInfo(VisitorStateEnum.QUERY_FAILED.getStateInfo());
            e.printStackTrace();
        }
        return visitorExecution;
    }

    @Override
    public AreaExecution queryArea() {
        AreaExecution areaExecution = new AreaExecution();
        try {
            List<Area> areas = basicInfoDao.queryArea();
            if (areas != null && areas.size() != 0) {
                areaExecution.setState(AreaStateEnum.QUREY_SUCCESS.getState());
                areaExecution.setStateInfo(AreaStateEnum.QUREY_SUCCESS.getStateInfo());
                areaExecution.setAreaList(areas);
            } else {
                areaExecution.setState(AreaStateEnum.FULL.getState());
                areaExecution.setStateInfo(AreaStateEnum.FULL.getStateInfo());
            }
        } catch (Exception e) {
            areaExecution.setState(AreaStateEnum.QUERY_FAILD.getState());
            areaExecution.setStateInfo(AreaStateEnum.QUERY_FAILD.getStateInfo());

            e.printStackTrace();
        }
        return areaExecution;
    }


}