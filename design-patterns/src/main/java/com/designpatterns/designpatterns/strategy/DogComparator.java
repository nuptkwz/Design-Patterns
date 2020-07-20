package com.designpatterns.designpatterns.strategy;

/**
 * Description
 * Date 2020/7/20 20:51
 * Created by kwz
 */
public class DogComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.food < o2.food) {
            return -1;
        } else if (o1.food > o2.food) {
            return 1;
        } else {
            return 0;
        }
    }
}
