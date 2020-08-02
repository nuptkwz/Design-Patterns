package com.designpatterns.designpatterns.iterator.v4;

/**
 * Description
 * Date 2020/8/3 0:35
 * Created by kwz
 */
public interface Collection_ {
    void add(Object o);

    int size();

    Iterator_ iterator();
}
