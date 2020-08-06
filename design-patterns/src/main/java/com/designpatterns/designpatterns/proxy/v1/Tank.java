package com.designpatterns.designpatterns.proxy.v1;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * Description
 * 记录坦克的移动时间
 * Date 2020/8/6 23:34
 * Created by kwz
 */
@Slf4j
public class Tank implements Movable {

    /**
     * 模拟坦克移动了一段时间
     */
    @Override
    public void move() {
        log.info("Tank moving ......");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

interface Movable {
    void move();
}
