package com.swpu.pojo;

import java.io.Serializable;

/**
 * 描述:
 * 访问者的信息
 *
 * @author ace-huang
 * @create 2019-08-15 4:04 PM
 */
public class Visitor implements Serializable {


    private String visitorId;
    private String visitorIp;
    private String counts;
    private String note;

    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    public String getVisitorIp() {
        return visitorIp;
    }

    public void setVisitorIp(String visitorIp) {
        this.visitorIp = visitorIp;
    }

    public String getCounts() {
        return counts;
    }

    public void setCounts(String counts) {
        this.counts = counts;
    }

    public String getCount() {
        return counts;
    }

    public void setCount(String count) {
        this.counts = count;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}