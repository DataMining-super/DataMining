package com.swpu.enums;

public enum VisitorStateEnum {

    QUERY_SUCCESS(0,"SUCCESS"),QUERY_FAILED(-1,"FAILED"),FULL(1,"NULL");

    private int state;
    private String stateInfo;

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

    VisitorStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }
}
