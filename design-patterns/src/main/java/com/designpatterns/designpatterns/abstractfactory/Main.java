package com.designpatterns.designpatterns.abstractfactory;

import com.designpatterns.designpatterns.factorymethod.Car;
import com.designpatterns.designpatterns.factorymethod.CarFactory;

/**
 * Description
 * 抽象工厂模式：
 * Date 2020/7/22 21:22
 * Created by kwz
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory f = new ModernFactory();
        Vehicle vehicle = f.createVehicle();
        vehicle.go();

        Weapon weapon = f.createWeapon();
        weapon.shoot();

        Food food = f.createFood();
        food.printName();
    }
}
