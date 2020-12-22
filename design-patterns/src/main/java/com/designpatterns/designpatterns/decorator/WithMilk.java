package com.designpatterns.designpatterns.decorator;

/**
 * Description
 * 此装饰类混合"牛奶"到原味咖啡中
 * Date 2020/12/22 23:44
 * Created by kwz
 */
public class WithMilk extends CoffeeDecorator{
    /**
     * 在构造方法中，初始化咖啡对象的引用
     *
     * @param coffee
     */
    public WithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        double additionalCost = 0.5;
        return super.getCost() + additionalCost;
    }

    @Override
    public String getIngredients() {
        String additionalIngredient = "milk";
        return super.getIngredients() + ", " + additionalIngredient;
    }
}
