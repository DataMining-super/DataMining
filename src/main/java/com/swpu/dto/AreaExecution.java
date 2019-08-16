package com.swpu.dto;

import com.swpu.pojo.Area;

import java.util.List;

/**
 * 描述:
 *
 * @author ace-huang
 * @create 2019-08-15 10:41 PM
 */
public class AreaExecution {

    private int state;
    private String stateInfo;

    private List<Area> areaList;

    public List<Area> getAreaList() {
        return areaList;
    }

    public void setAreaList(List<Area> areaList) {
        this.areaList = areaList;
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
}