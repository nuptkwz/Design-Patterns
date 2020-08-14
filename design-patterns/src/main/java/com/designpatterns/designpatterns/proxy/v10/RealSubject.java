package com.designpatterns.designpatterns.proxy.v10;

/**
 * Description
 * 实际对象
 * Date 2020/8/15 3:21
 * Created by kwz
 */

public class RealSubject implements Subject {
    public void save() {
        System.out.println("insert into ......");
        save2();
    }

    @Override
    public void save2() {
        System.out.println("then save2 into ......");
    }

}
