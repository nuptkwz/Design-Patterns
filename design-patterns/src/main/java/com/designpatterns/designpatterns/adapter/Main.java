package com.designpatterns.designpatterns.adapter;

import org.springframework.util.StringUtils;

import java.io.*;

/**
 * Description
 * 适配器模式
 * 如果一个类不能访问另一个类的时候，中间加一个转换，就叫转换器
 * 适配器模式简单的说就是将一个类的接口转换成客户希望的另一个接口。
 * 适配器模式让那些接口不兼容的类可以一起工作。
 * Date 2020/7/29 23:10
 * Created by kwz
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("D:/test.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            String line = bufferedReader.readLine();
            while (!StringUtils.isEmpty(line)) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }
    }
}
