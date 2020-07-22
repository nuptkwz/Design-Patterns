package com.designpatterns.designpatterns.strategy;

import java.util.Arrays;

/**
 * Description
 * 策略模式:
 * Date 2020/7/20 20:08
 * Created by kwz
 */
public class Main {

    public static void main(String[] args) {
//        int[] a = {3, 4, 6, 12, 1, 0, 5};
        Dog[] dog = {new Dog(3), new Dog(5), new Dog(1)};
        Sorter<Dog> sorter = new Sorter();
        sorter.sort(dog, new DogComparator());
        System.out.println(Arrays.toString(dog));
    }
}
