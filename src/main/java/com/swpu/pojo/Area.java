package com.swpu.pojo;

import java.io.Serializable;

/**
 * 描述:
 * 归属地信息'
 *
 * @author ace-huang
 * @create 2019-08-15 4:04 PM
 */
public class Area implements Serializable {

    private Integer affId;
    private String province;
    private String city;
    private String counts;
    private String detail;

    public Integer getAffId() {
        return affId;
    }

    public void setAffId(Integer affId) {
        this.affId = affId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCount() {
        return counts;
    }

    public void setCount(String count) {
        this.counts = count;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}