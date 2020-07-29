package com.designpatterns.designpatterns.templatemethod;

/**
 * Description
 * Date 2020/7/29 22:00
 * Created by kwz
 */
public abstract class Father {

    public void method() {
        operation1();
        operation2();
    }

    abstract void operation2();

    abstract void operation1();
}
