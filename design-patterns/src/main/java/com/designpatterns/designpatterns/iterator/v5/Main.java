package com.designpatterns.designpatterns.iterator.v5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Description
 * JDK的容器的Iterator
 * Date 2020/8/3 0:39
 * Created by kwz
 */
public class Main {

    public static void main(String[] args) {
        Collection c = new ArrayList();
        for (int i = 0; i < 15; i++) {
            c.add("s" + i);
        }

        Iterator it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
