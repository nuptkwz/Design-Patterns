package com.designpatterns.designpatterns.factorymethod;

import lombok.extern.slf4j.Slf4j;

/**
 * Description
 * Date 2020/7/22 22:57
 * Created by kwz
 */
@Slf4j
public class CarFactory {

    public Car create() {
        log.info("created a car");
        return new Car();
    }
}
