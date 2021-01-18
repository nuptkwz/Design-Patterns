package com.designpatterns.designpatterns.visitor;

/**
 * Description
 * Date 2021/1/18 23:21
 * Created by kwz
 */
public class CorpVisitor implements IVisitor {
    private double totalPrice = 0.0;

    @Override
    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.6;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.75;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice() * 0.75;
    }
}
