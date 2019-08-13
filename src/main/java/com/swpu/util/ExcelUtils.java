package com.swpu.util;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 描述:
 * excel相关的处理
 *
 * @author ace-huang
 * @create 2019-08-12 3:17 PM
 */
public class ExcelUtils {


    private final static String excel2003L = ".xls";
    private final static String excel2007U = ".xlsx";


    /**
     * 获取IO流中的数据，返回list对象
     * @param in
     * @param fileName
     * @return
     */
    public void getBankListByExcel(InputStream in,String fileName) throws Exception {

        //创建excel工作簿
        Workbook workbook = this.getWorkbook(in,fileName);

        if(workbook == null)
            throw new Exception("创建workbook为空");
        Sheet sheet = null;//记录页
        Row row = null;
        Cell cell = null;

        //获取文件的地址
        try{
            String filepath = FileUtil.createFile();
            //遍历所有的页数
            for (int i = 0; i < workbook.getNumberOfSheets() ; i++) {
                sheet = workbook.getSheetAt(i);
                if(sheet == null)
                    continue;
                for (int j = 0; j < sheet.getLastRowNum() ; j++) {
                    String rowContent = "";
                    row = sheet.getRow(j);//读取一行
                    if(row == null || row.getFirstCellNum() == j)
                        continue;
                    for (int k = 1; k < row.getLastCellNum() ; k++) {
                        cell = row.getCell(k);
                        if(cell == null)
                            cell.setCellValue("");
                        rowContent += cell.toString()+" " + ",";
                    }

                    try{
                        this.WriteToFile(rowContent,filepath);
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    //获取excel的workbook
    public Workbook getWorkbook(InputStream inputStream,String fileName) throws Exception {

        Workbook workbook = null;
        String fileType = fileName.substring(fileName.lastIndexOf("."));
        if(excel2003L.equals(fileType))
            workbook = new HSSFWorkbook(inputStream);
        else if (excel2007U.equals(fileType))
            workbook = new XSSFWorkbook(inputStream);
        else
            throw new Exception("解析的文件格式错误");
        return workbook;
    }
    //将数据写入文件
    public  void WriteToFile(String str, String filePath) throws IOException {

        BufferedWriter bw = null;
        try {
            FileOutputStream out = new FileOutputStream(filePath, true);// true,表示:文件追加内容，不重新生成,默认为false
            bw = new BufferedWriter(new OutputStreamWriter(out, "UTF-8"));
            bw.write(str += "\r\n");// 换行
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bw.close();
        }
    }



    public String getValue(Cell cell){
        String value = "";

        if(cell == null)
            return value;
        switch (cell.getCellType()){
            //数值型
            case Cell.CELL_TYPE_NUMERIC:
                if (HSSFDateUtil.isCellDateFormatted(cell)) {
                    //如果是date类型则 ，获取该cell的date值
                    Date date = HSSFDateUtil.getJavaDate(cell.getNumericCellValue());
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                    value = format.format(date);;
                }else {// 纯数字
                    BigDecimal big=new BigDecimal(cell.getNumericCellValue());
                    value = big.toString();
                    //解决1234.0  去掉后面的.0
                    if(null!=value&&!"".equals(value.trim())){
                        String[] item = value.split("[.]");
                        if(1<item.length&&"0".equals(item[1])){
                            value=item[0];
                        }
                    }
                }
                break;
            //字符串类型
            case Cell.CELL_TYPE_STRING:
                value = cell.getStringCellValue().toString();
                break;
            // 公式类型
            case Cell.CELL_TYPE_FORMULA:
                //读公式计算值
                value = String.valueOf(cell.getNumericCellValue());
                if (value.equals("NaN")) {// 如果获取的数据值为非法值,则转换为获取字符串
                    value = cell.getStringCellValue().toString();
                }
                break;
            // 布尔类型
            case Cell.CELL_TYPE_BOOLEAN:
                value = " "+ cell.getBooleanCellValue();
                break;
            default:
                value = cell.getStringCellValue().toString();
        }
        if("null".endsWith(value.trim())){
            value="";
        }
        return value;

    }

}