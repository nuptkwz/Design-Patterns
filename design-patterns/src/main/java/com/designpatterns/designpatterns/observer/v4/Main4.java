package com.designpatterns.designpatterns.observer.v4;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 * 在很多时候，观察者需要根据事件的具体情况来进行处理，
 * 大多数时候，我们处理事件的时候，需要事件源对象
 * 事件也可以形成继承体系
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

public class Main4 {

}
