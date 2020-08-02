package com.designpatterns.designpatterns.iterator.v4;

/**
 * Description
 * Date 2020/8/3 0:37
 * Created by kwz
 */
public class Main {

    public static void main(String[] args) {
        Collection_ list = new ArrayList_();
        for (int i = 0; i < 15; i++) {
            list.add(new String("s" + i));
        }
        System.out.println(list.size());

        //这个接口的调用方式：
        Iterator_ it = list.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }
    }
}
