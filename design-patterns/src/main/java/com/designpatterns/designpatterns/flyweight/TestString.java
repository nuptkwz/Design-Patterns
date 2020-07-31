package com.designpatterns.designpatterns.flyweight;

/**
 * Description
 * 应用：1.String常量池    2.数据库连接池
 * Date 2020/7/31 22:15
 * Created by kwz
 */
public class TestString {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1 == s2);//字符串常量池
        System.out.println(s1 == s3);//
        System.out.println(s3 == s4);//堆里面有对象，对象一定不一样，所以是false
        System.out.println(s3.intern() == s1);//s3.intern()拿到常量池中的引用
        System.out.println(s3.intern() == s4.intern());
    }
}
