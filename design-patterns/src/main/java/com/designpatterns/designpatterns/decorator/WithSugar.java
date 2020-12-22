package com.designpatterns.designpatterns.decorator;

/**
 * Description
 * Date 2020/12/22 23:46
 * Created by kwz
 */
public class WithSugar extends CoffeeDecorator{

    /**
     * 在构造方法中，初始化咖啡对象的引用
     *
     * @param coffee
     */
    public WithSugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Sugar";
    }
}
