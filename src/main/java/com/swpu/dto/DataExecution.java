package com.swpu.dto;

import com.swpu.enums.DataStateEnum;
import com.swpu.pojo.BasicData;

import java.util.List;

/**
 * 描述:
 *  数据相关操作的执行结果
 * @author ace-huang
 * @create 2019-08-15 5:35 PM
 */
public class DataExecution {


    private List<BasicData> basicDataList;
    private int state;
    private String stateInfo;
    private long count;

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List<BasicData> getBasicDataList() {
        return basicDataList;
    }

    public void setBasicDataList(List<BasicData> basicDataList) {
        this.basicDataList = basicDataList;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public DataExecution() {
    }
    public DataExecution(DataStateEnum dataStateEnum){
        this.state = dataStateEnum.getState();
        this.stateInfo = dataStateEnum.getStateInfo();
    }

    public DataExecution(DataStateEnum dataStateEnum, List<BasicData> basicDataList) {
        this.basicDataList = basicDataList;
        this.state = dataStateEnum.getState();
        this.stateInfo = dataStateEnum.getStateInfo();
    }

}