package com.designpatterns.designpatterns.visitor;

/**
 * Description
 * Date 2021/1/18 23:14
 * Created by kwz
 */
public class Board extends ComputerPart {

    @Override
    void accept(IVisitor v) {
        v.visitBoard(this);
    }

    @Override
    double getPrice() {
        return 200;
    }
}
