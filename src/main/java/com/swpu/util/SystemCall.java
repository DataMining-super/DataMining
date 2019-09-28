package com.swpu.util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 描述:
 *
 * @author huang
 * @create 2019-09-28 10:51 AM
 */

public class SystemCall {

    public static void call(String sh) {
//        String sh = "python /Users/huang/PycharmProjects/project2/src/huang/db/add.py /Users/huang/PycharmProjects/project2/src/huang/data/2019081422331939002.txt";
        Runtime runtime = Runtime.getRuntime();
        try {
            Process p = runtime.exec(sh);
            BufferedInputStream in = new BufferedInputStream(p.getInputStream());
            BufferedInputStream error = new BufferedInputStream(p.getErrorStream());

            BufferedReader inBr = new BufferedReader(new InputStreamReader(in));
            BufferedReader errorBr = new BufferedReader(new InputStreamReader(error));

            String lineStr;
            while ((lineStr = inBr.readLine()) != null) {
                //获得命令执行后在控制台的输出信息
                System.out.println(lineStr);
                // 打印输出信息
            }

            String errorStr;
            while ((errorStr = errorBr.readLine()) != null) {
                //获得命令执行后在控制台的输出信息
                System.out.println("error : " + errorStr);
                // 打印输出信息
            }

            if (p.waitFor() != 0) {
                System.out.println(p.waitFor());
            }
        } catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }

}
