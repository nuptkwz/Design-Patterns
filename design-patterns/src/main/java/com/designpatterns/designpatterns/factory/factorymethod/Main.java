package com.designpatterns.designpatterns.factory.factorymethod;

import com.designpatterns.designpatterns.factory.factorymethod.Car;

/**
 * Description
 * 工厂模式：任何可以产生对象的方法或类，都可以称之为工厂
 * Date 2020/7/22 21:22
 * Created by kwz
 */
public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.go();
    }
}
