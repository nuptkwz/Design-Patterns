package com.designpatterns.designpatterns.strategy;

/**
 * Description
 * Date 2020/7/20 20:38
 * Created by kwz
 */
@FunctionalInterface
public interface Comparator<T> {

    int compare(T o1, T o2);
}
