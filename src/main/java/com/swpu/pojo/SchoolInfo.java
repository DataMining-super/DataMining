package com.swpu.pojo;

/**
 * 描述:
 * 学校信息
 *
 * @author ace-huang
 * @create 2019-08-12 4:42 PM
 */
public class SchoolInfo {

    private Integer schoolId;
    private String siteName;
    private String sourceIp;
    private String netAddress;

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public String getNetAddress() {
        return netAddress;
    }

    public void setNetAddress(String netAddress) {
        this.netAddress = netAddress;
    }
}