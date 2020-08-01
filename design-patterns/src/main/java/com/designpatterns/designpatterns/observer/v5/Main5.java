package com.designpatterns.designpatterns.observer.v5;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 * 在很多系统中Observe模式往往和责任链共同负责对于事件的
 * 处理，其中的某一个observe负责是否将事件进一步传递
 * Date 2020/8/1 0:18
 * Created by kwz
 */
class Child {
    private boolean cry = false;
    private List<Observer> observers = new ArrayList<>();

    {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
        observers.add((e) -> {
            System.out.println("hhh");
        });
    }

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        cry = true;

        WakeUpEvent wakeUpEvent = new WakeUpEvent(System.currentTimeMillis(), "bed");
        for (Observer o : observers) {
            o.actionOnWakeUp(wakeUpEvent);
        }
    }
}

//事件类 fire event
class WakeUpEvent {
    long timestamp;
    String loc;

    public WakeUpEvent(long timestamp, String loc) {
        this.timestamp = timestamp;
        this.loc = loc;
    }
}

interface Observer {
    void actionOnWakeUp(WakeUpEvent wakeUpEvent);
}

class Dad implements Observer {
    private void feed() {
        System.out.println("dad feed.....");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent wakeUpEvent) {
        feed();
    }
}

class Mum implements Observer {
    private void feed() {
        System.out.println("mum feed.....");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent wakeUpEvent) {
        feed();
    }
}

class Dog implements Observer {
    private void feed() {
        System.out.println("dog.....");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent wakeUpEvent) {
        feed();
    }
}

public class Main5 {

    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}
