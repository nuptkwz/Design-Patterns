package com.designpatterns.designpatterns.abstractfactory;

/**
 * Description
 * Date 2020/7/26 23:41
 * Created by kwz
 */
public class MagicFactory extends AbstractFactory {

    @Override
    Food createFood() {
        return new MushRoom();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }
}
