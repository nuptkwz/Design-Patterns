package com.designpatterns.designpatterns.factory.factorymethod;

/**
 * Description
 * 简单工厂
 * Date 2020/7/22 22:51
 * Created by kwz
 */
public class SimpleVehicleFactory {

    public Car createCar() {

        return new Car();
    }

    public Broom createBroom() {
        return new Broom();
    }
}
