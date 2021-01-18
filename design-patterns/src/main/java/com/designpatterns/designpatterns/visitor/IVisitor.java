package com.designpatterns.designpatterns.visitor;

/**
 * Description
 * Date 2021/1/18 23:16
 * Created by kwz
 */
public interface IVisitor {
    void visitCpu(CPU cpu);

    void visitMemory(Memory memory);

    void visitBoard(Board board);
}
