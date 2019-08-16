package com.swpu.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 描述:
 * 基本数据
 *
 * @author ace-huang
 * @create 2019-08-15 4:00 PM
 */
public class BasicData implements Serializable {

    private Integer basicId;
    private String invadeLocation;
    private String vositorIp;
    private String affiliation;
    private String detail;
    private Date invadeTime;
    private String note;
    private String invaMethod;

    public Integer getBasicId() {
        return basicId;
    }

    public void setBasicId(Integer basicId) {
        this.basicId = basicId;
    }

    public String getInvadeLocation() {
        return invadeLocation;
    }

    public void setInvadeLocation(String invadeLocation) {
        this.invadeLocation = invadeLocation;
    }

    public String getVositorIp() {
        return vositorIp;
    }

    public void setVositorIp(String vositorIp) {
        this.vositorIp = vositorIp;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getInvadeTime() {
        return invadeTime;
    }

    public void setInvadeTime(Date invadeTime) {
        this.invadeTime = invadeTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getInvaMethod() {
        return invaMethod;
    }

    public void setInvaMethod(String invaMethod) {
        this.invaMethod = invaMethod;
    }



}