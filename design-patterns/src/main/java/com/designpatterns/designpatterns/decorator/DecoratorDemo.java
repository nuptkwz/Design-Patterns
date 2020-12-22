package com.designpatterns.designpatterns.decorator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * Description
 * java中IO相关工具就普遍大量使用了装饰器模式
 * Date 2020/12/22 23:17
 * Created by kwz
 */
public class DecoratorDemo {

    public static void main(String[] args) throws Exception {
        File file = new File("D:/file/测试文件/test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        bufferedWriter.write(2);
        bufferedWriter.write("hello");
        bufferedWriter.flush();
        bufferedWriter.close();
        System.out.println(bufferedWriter);
    }
}
