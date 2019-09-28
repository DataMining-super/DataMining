package com.swpu.service;


import com.swpu.dto.AreaExecution;
import com.swpu.dto.DataExecution;
import com.swpu.dto.VisitorExecution;
import com.swpu.pojo.DateMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *基本数据操作的相关接口
 * author:acehcl
 */
public interface BasicInfoService {


    void uploadExcel(MultipartFile file);

    DataExecution queryDataList(int pageIndex, int pageSize);

    VisitorExecution queryTenRecord();

    AreaExecution queryArea();

    List<DateMapping> dateCount(int year, int month);
}
