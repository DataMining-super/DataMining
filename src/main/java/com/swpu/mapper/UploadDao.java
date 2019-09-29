package com.swpu.mapper;

import com.swpu.pojo.UploadMapping;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 描述:
 *
 * @author huang
 * @create 2019-09-28 1:55 PM
 */
public interface UploadDao {
    /**
     * 添加一条上传记录
     * @param userId 用户id
     * @param fileName 文件名
     * @param size 文件大小
     */
    void addUpload(@Param("userId") int userId,@Param("fileName") String fileName, @Param("size")String size);

    /**
     * 查询用户上传记录
     * @param userId 用户id
     */
    List<UploadMapping> queryUpload(@Param("userId") int userId);

    /**
     * 查询数据上传是否完毕
     * @return 0代表没有 1代表完毕
     */
    int queryReady();
}