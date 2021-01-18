package com.designpatterns.designpatterns.visitor;

/**
 * Description
 * Date 2021/1/18 23:13
 * Created by kwz
 */
public abstract class ComputerPart {

    abstract void accept(IVisitor v);

    //some other operations eg:getName getBrand
    abstract double getPrice();
}
