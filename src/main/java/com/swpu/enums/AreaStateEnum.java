package com.swpu.enums;

import com.swpu.pojo.Area;

import java.util.List;

public enum AreaStateEnum {
    QUREY_SUCCESS(0, "SUCCESS"),QUERY_FAILD(-1, "FAILD"),FULL(1, "NULL");

    private int state;
    private String stateInfo;

    AreaStateEnum(int i, String aNull) {
        this.state = i;
        this.stateInfo = aNull;
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
