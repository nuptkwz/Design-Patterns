package com.designpatterns.designpatterns.abstractfactory;

/**
 * Description
 * Date 2020/7/22 23:11
 * Created by kwz
 */
public abstract class AbstractFactory {

    abstract Food createFood();

    abstract Vehicle createVehicle();

    abstract Weapon createWeapon();
}
