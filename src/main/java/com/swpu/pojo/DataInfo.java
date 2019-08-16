package com.swpu.pojo;

import java.io.Serializable;

/**
 * 描述:
 * 标记的信息
 *
 * @author ace-huang
 * @create 2019-08-15 4:03 PM
 */
public class DataInfo  implements Serializable {

    private Integer dataId;
    private String note;


    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}