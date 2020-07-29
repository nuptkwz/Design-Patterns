package com.designpatterns.designpatterns.templatemethod;

/**
 * Description 模板方法模式
 * 钩子函数：回调函数
 * Date 2020/7/29 22:00
 * Created by kwz
 */
public class Main {
    public static void main(String[] args) {
        Father son1 = new Son1();
        son1.method();

        Father son2 = new Son2();
        son2.method();
    }
}
