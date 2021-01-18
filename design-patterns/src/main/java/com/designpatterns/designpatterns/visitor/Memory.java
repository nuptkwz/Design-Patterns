package com.designpatterns.designpatterns.visitor;

/**
 * Description
 * Date 2021/1/18 23:23
 * Created by kwz
 */
public class Memory extends ComputerPart{
    @Override
    void accept(IVisitor v) {
        v.visitMemory(this);
    }

    @Override
    double getPrice() {
        return 300;
    }
}
