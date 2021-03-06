package com.designpatterns.designpatterns.decorator;

/**
 * Description
 * Date 2020/12/22 23:47
 * Created by kwz
 */
public class Main {

    public static void main(String[] args) {
        //原味咖啡
        Coffee c = new SimpleCoffee();
        print(c);

        //增加牛奶的咖啡
        c = new WithMilk(c);
        print(c);

        //再加一点糖
        c = new WithSugar(c);
        print(c);
    }

    private static void print(Coffee c) {
        System.out.println("花费了: " + c.getCost());
        System.out.println("配料: " + c.getIngredients());
        System.out.println("============");
    }
}
