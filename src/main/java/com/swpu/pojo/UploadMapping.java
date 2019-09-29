package com.swpu.pojo;

import lombok.Data;

/**
 * 描述:
 *
 * @author huang
 * @create 2019-09-28 2:07 PM
 */
@Data
public class UploadMapping {
    private int uploadId;
    private int userId;
    private String fileName;
    private boolean ready;
    private String size;
}