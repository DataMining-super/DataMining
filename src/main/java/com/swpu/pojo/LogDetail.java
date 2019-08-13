package com.swpu.pojo;

/**
 * 描述:
 *
 * @author ace-huang
 * @create 2019-08-12 4:46 PM
 */
public class LogDetail {

    private Integer detailId;

    private  String methos;

    private String errorKind;

    private String note;

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public String getMethos() {
        return methos;
    }

    public void setMethos(String methos) {
        this.methos = methos;
    }

    public String getErrorKind() {
        return errorKind;
    }

    public void setErrorKind(String errorKind) {
        this.errorKind = errorKind;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}