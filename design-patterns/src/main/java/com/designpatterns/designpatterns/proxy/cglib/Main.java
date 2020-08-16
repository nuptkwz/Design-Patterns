package com.designpatterns.designpatterns.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * Description
 * CGLIB 实现动态代理不需要接口
 * 它的底层也是用的asm
 * Date 2020/8/16 17:30
 * Created by kwz
 */
public class Main {

    public static void main(String[] args) {
        //enhancer 英文是增强的意思、增强者，增强器，把原来的类增强一下
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new TimeMethodInterceptor());
        Tank tank = (Tank) enhancer.create();
        tank.remove();
    }
}

class TimeMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //它的父类打印出来是com.designpatterns.designpatterns.proxy.cglib.Tank，生成tank类的子类
        System.out.println(o.getClass().getSuperclass().getName());
        System.out.println("before");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("after");
        return result;
    }
}

class Tank {
    void remove() {
        System.out.println("Tank moving......");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
