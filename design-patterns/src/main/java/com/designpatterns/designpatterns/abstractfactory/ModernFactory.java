package com.designpatterns.designpatterns.abstractfactory;

/**
 * Description
 * Date 2020/7/26 23:41
 * Created by kwz
 */
public class ModernFactory extends AbstractFactory {

    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new Gun();
    }
}
