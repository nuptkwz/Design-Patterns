package com.designpatterns.designpatterns.decorator;

/**
 * Description
 * 咖啡的"装饰器"，可以给咖啡添加各种"配料"
 * Date 2020/12/22 23:39
 * Created by kwz
 */
abstract class CoffeeDecorator implements Coffee {
    protected final Coffee decoratedCoffee;

    /**
     * 在构造方法中，初始化咖啡对象的引用
     * @param coffee
     */
    public CoffeeDecorator(Coffee coffee) {
        decoratedCoffee = coffee;
    }

    /**
     * 装饰器父类中直接转发"请求"至引用对象
     * @return
     */
    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }

    @Override
    public String getIngredients() {
        return decoratedCoffee.getIngredients();
    }
}
