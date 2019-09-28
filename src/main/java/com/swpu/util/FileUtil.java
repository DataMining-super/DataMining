package com.swpu.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class FileUtil {
	private static String seperator = System.getProperty("file.separator");
	/**
	 * 	时间格式化的格式
 	 */
	private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	private static final Random r = new Random();

	public static final String sh = "python /Users/huang/PycharmProjects/project2/src/huang/db/add.py ";

    public static String getAbsolutePath(String originalFilename) {

        return null;
    }

    //根据系统属性创建目录
	public static String getBasePath() {
		String os = System.getProperty("os.name");
		String basePath = "";
		if (os.toLowerCase().startsWith("win")) {
			basePath = "D:/Datamining/file";
		} else {
			basePath = "/personpath/datamining/";
		}
		basePath = basePath.replace("/", seperator);
		return basePath;
	}


	public static String getRandomFileName() {
		// 生成随机文件名：当前年月日时分秒+五位随机数（为了在实际项目中防止文件同名而进行的处理）
		int rannum = (int) (r.nextDouble() * (99999 - 10000 + 1)) + 10000; // 获取随机数
		String nowTimeStr = sDateFormat.format(new Date()); // 当前时间
		return nowTimeStr + rannum;
	}


	//文件上传时创建目录
	public static String createFile() throws IOException {
		String filePath = FileUtil.getBasePath();
		String fileName = getRandomFileName() + ".txt";
		File file = new File(filePath,fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		return filePath + fileName;
	}

}
