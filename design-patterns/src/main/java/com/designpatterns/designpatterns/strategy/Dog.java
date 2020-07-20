package com.designpatterns.designpatterns.strategy;

import lombok.Data;

/**
 * Description
 * Date 2020/7/20 20:14
 * Created by kwz
 */
@Data
public class Dog implements Comparable<Dog> {
    private int food;

    public Dog(int food) {
        this.food = food;
    }


    @Override
    public int compareTo(Dog dog) {
        if (this.food < dog.food) {
            return -1;
        } else if (this.food > dog.food) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
