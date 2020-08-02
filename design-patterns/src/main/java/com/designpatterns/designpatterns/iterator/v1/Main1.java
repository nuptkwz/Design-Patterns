package com.designpatterns.designpatterns.iterator.v1;

import java.util.Arrays;

/**
 * Description
 * 构建一个容器，可以添加对象,为了区别jdk内部的ArrayList，在类后面加一个_
 * Date 2020/8/3 0:00
 * Created by kwz
 */
public class Main1 {

    public static void main(String[] args) {
        ArrayList_ list = new ArrayList_();
        for (int i = 0; i < 15; i++) {
            list.add(new String("s" + i));
        }
        System.out.println(list);
    }
}

class ArrayList_ {
    Object[] objects = new Object[10];

    private int index = 0;

    public void add(Object o) {
        //达到长度进行扩容,扩容为原来的2倍
        if (index == objects.length) {
            Object[] newObjects = new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[index++] = o;
    }

    public int size() {
        return index;
    }

    @Override
    public String toString() {
        return "ArrayList_{" +
                "objects=" + Arrays.toString(objects) +
                ", index=" + index +
                '}';
    }
}
