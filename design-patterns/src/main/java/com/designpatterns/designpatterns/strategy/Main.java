package com.designpatterns.designpatterns.strategy;

import java.util.Arrays;

/**
 * Description
 * 策略模式
 * Date 2020/7/20 20:08
 * Created by kwz
 */
public class Main {

    public static void main(String[] args) {
        int[] a = {3, 4, 6, 12, 1, 0, 5};
        Sorter sorter = new Sorter();
        sorter.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
