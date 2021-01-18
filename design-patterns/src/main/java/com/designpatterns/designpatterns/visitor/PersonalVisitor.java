package com.designpatterns.designpatterns.visitor;

/**
 * Description
 * Date 2021/1/18 23:22
 * Created by kwz
 */
public class PersonalVisitor implements IVisitor {
    double totalPrice = 0.0;

    @Override
    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.9;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.85;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice() * 0.95;
    }
}
