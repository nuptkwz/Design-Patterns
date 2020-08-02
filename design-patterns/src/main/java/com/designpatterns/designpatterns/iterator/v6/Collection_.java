package com.designpatterns.designpatterns.iterator.v6;

/**
 * Description
 * Date 2020/8/3 0:35
 * Created by kwz
 */
public interface Collection_<E> {
    void add(E o);
    int size();
    Iterator_ iterator();
}
