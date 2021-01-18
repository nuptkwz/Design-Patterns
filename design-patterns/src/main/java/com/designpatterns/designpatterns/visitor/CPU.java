package com.designpatterns.designpatterns.visitor;

/**
 * Description
 * Date 2021/1/18 23:25
 * Created by kwz
 */
public class CPU extends ComputerPart {
    @Override
    void accept(IVisitor v) {
        v.visitCpu(this);
    }

    @Override
    double getPrice() {
        return 500;
    }
}
