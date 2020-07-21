package com.designpatterns.designpatterns.strategy;

/**
 * Description
 * Date 2020/7/20 20:51
 * Created by kwz
 */
public class CatWeightComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.weight < o2.weight) {
            return -1;
        } else if (o1.weight > o2.weight) {
            return 1;
        } else {
            return 0;
        }
    }
}
