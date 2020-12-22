package com.designpatterns.designpatterns.decorator;

/**
 * Description
 * 咖啡类
 * Date 2020/12/22 23:36
 * Created by kwz
 */
public interface Coffee {
    /**
     * 获取价格
     */
    double getCost();

    /**
     * 获取配料
     */
    String getIngredients();
}
