package com.swpu.pojo;

/**
 * 描述:
 * 访问者信息
 *
 * @author ace-huang
 * @create 2019-08-12 4:40 PM
 */
public class VisitorInfo {

    private Integer visitorId;

    private String visitorIp;

    private  Integer account;

    private String note;


    public Integer getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Integer visitorId) {
        this.visitorId = visitorId;
    }

    public String getVisitorIp() {
        return visitorIp;
    }

    public void setVisitorIp(String visitorIp) {
        this.visitorIp = visitorIp;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}