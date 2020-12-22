package com.designpatterns.designpatterns.decorator;

/**
 * Description
 * 原文咖啡
 * Date 2020/12/22 23:37
 * Created by kwz
 */
public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 1;
    }

    @Override
    public String getIngredients() {
        return "simple coffer";
    }
}
