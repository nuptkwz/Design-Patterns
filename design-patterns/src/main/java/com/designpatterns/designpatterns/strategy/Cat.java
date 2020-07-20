package com.designpatterns.designpatterns.strategy;

import lombok.Data;

/**
 * Description
 * Date 2020/7/20 20:14
 * Created by kwz
 */
@Data
public class Cat implements Comparable<Cat> {
    private int weight;
    private int height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public int compareTo(Cat cat) {
        if (this.height < cat.height) {
            return -1;
        } else if (this.height > cat.height) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
