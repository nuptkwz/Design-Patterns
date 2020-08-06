package com.designpatterns.designpatterns.proxy.v2;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * Description
 * 问题：我想记录坦克的移动时间
 * 最简单的办法：修改代码，记录时间
 * 问题2：如果无法改变方法源码呢？ benchmark
 * Date 2020/8/6 23:41
 * Created by kwz
 */
@Slf4j
public class Tank implements Movable {

    /**
     * 模拟坦克移动了一段儿时间
     */
    @Override
    public void move() {
        long start = System.currentTimeMillis();

        System.out.println("Tank moving ......");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void main(String[] args) {
        new Tank().move();
    }
}

interface Movable {
    void move();
}