package com.designpatterns.designpatterns.observer.v2;

/**
 * Description
 * Date 2020/8/1 0:09
 * Created by kwz
 */
class Child {
    private boolean cry = false;

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        System.out.println("waked Up! crying ......");
        cry = true;
    }
}


public class Main1 {

    public static void main(String[] args) {
        Child child = new Child();
        while (!child.isCry()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("observing...");
        }
    }
}
