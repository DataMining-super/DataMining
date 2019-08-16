package com.swpu.dto;

import com.swpu.pojo.Visitor;

import java.util.List;

/**
 * 描述:
 *
 * @author ace-huang
 * @create 2019-08-15 10:09 PM
 */
public class VisitorExecution {

    private int state;
    private String stateInfo;

    private List<Visitor> visitors;


    public VisitorExecution() {
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

    public List<Visitor> getVisitors() {
        return visitors;
    }

    public void setVisitors(List<Visitor> visitors) {
        this.visitors = visitors;
    }
}