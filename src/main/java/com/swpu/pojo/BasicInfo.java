package com.swpu.pojo;

import java.util.Date;

/**
 * 描述:
 * 基本数据
 *
 * @author ace-huang
 * @create 2019-08-12 4:48 PM
 */
public class BasicInfo {

    private Integer id;
    private String deviceName;
    private String deviceIp;
    private String account;
    private String terminalIp;
    private String terminalMAC;
    private String aimIp;
    private String visitWebsite;
    private String visitUrl;
    private String terminalInfo;
    private Date visitTime;
    private String sourcePort;
    private String aimPort;
    private String networkDelay;
    private String van;
    private String note1;
    private String note2;

    //
    private DataInfo dataInfo;
    private VisitorInfo visitorInfo;
    private AddressInfo addressInfo;
    private SchoolInfo schoolInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceIp() {
        return deviceIp;
    }

    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getTerminalIp() {
        return terminalIp;
    }

    public void setTerminalIp(String terminalIp) {
        this.terminalIp = terminalIp;
    }

    public String getTerminalMAC() {
        return terminalMAC;
    }

    public void setTerminalMAC(String terminalMAC) {
        this.terminalMAC = terminalMAC;
    }

    public String getArmIp() {
        return aimIp;
    }

    public void setArmIp(String armIp) {
        this.aimIp = armIp;
    }

    public String getVisitWebsite() {
        return visitWebsite;
    }

    public void setVisitWebsite(String visitWebsite) {
        this.visitWebsite = visitWebsite;
    }

    public String getVisitUrl() {
        return visitUrl;
    }

    public void setVisitUrl(String visitUrl) {
        this.visitUrl = visitUrl;
    }

    public String getTerminalInfo() {
        return terminalInfo;
    }

    public void setTerminalInfo(String terminalInfo) {
        this.terminalInfo = terminalInfo;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public String getSourcePort() {
        return sourcePort;
    }

    public void setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
    }

    public String getAimPort() {
        return aimPort;
    }

    public void setAimPort(String aimPort) {
        this.aimPort = aimPort;
    }

    public String getNetworkDelay() {
        return networkDelay;
    }

    public void setNetworkDelay(String networkDelay) {
        this.networkDelay = networkDelay;
    }

    public String getVan() {
        return van;
    }

    public void setVan(String van) {
        this.van = van;
    }

    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1;
    }

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2;
    }


    public DataInfo getDataInfo() {
        return dataInfo;
    }

    public void setDataInfo(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    public VisitorInfo getVisitorInfo() {
        return visitorInfo;
    }

    public void setVisitorInfo(VisitorInfo visitorInfo) {
        this.visitorInfo = visitorInfo;
    }

    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(AddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }

    public SchoolInfo getSchoolInfo() {
        return schoolInfo;
    }

    public void setSchoolInfo(SchoolInfo schoolInfo) {
        this.schoolInfo = schoolInfo;
    }
}