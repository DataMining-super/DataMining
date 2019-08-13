package com.swpu.pojo;

/**
 * 描述:
 * 数据特征相关的信息
 *
 * @author ace-huang
 * @create 2019-08-12 4:47 PM
 */
public class DataInfo {

    private Integer dataId;

    private String structure;

    private String markInfo;


    private String note;

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getMarkInfo() {
        return markInfo;
    }

    public void setMarkInfo(String markInfo) {
        this.markInfo = markInfo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}