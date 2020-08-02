package com.designpatterns.designpatterns.iterator.v6;

/**
 * Description
 * 实现泛型版本的迭代器
 * Date 2020/8/3 0:41
 * Created by kwz
 */
public class Main {

    public static void main(String[] args) {
        Collection_<String> list = new ArrayList_<>();
        for (int i = 0; i < 15; i++) {
            list.add(new String("s" + i));
        }
        System.out.println(list.size());

        //这个接口的调用方式：
        Iterator_<String> it = list.iterator();
        while (it.hasNext()) {
            String o = it.next();
            System.out.println(o);
        }
    }
}
