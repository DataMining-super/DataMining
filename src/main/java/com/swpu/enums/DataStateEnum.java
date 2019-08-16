package com.swpu.enums;

public enum DataStateEnum {


    QUERY_SUCCESS(0,"SUCCESS"),QUERY_FAILED(1,"failed"),FULL(-1,"数据库为空");

    private int state;
    private String stateInfo;

    DataStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
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
