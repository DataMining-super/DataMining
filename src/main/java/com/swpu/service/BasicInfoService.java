package com.swpu.service;


import com.swpu.dto.AreaExecution;
import com.swpu.dto.DataExecution;
import com.swpu.dto.VisitorExecution;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *基本数据操作的相关接口
 * author:acehcl
 */
public interface BasicInfoService {


    public void uploadExcel(HttpServletRequest request,HttpServletResponse response);

    public DataExecution queryDataList(int pageIndex, int pageSize);

    VisitorExecution queryTenRecord();

    AreaExecution queryArea();
}
