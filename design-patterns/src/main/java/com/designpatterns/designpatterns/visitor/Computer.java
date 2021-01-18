package com.designpatterns.designpatterns.visitor;

public class Computer {
    private ComputerPart cpu = new CPU();
    private ComputerPart memory = new Memory();
    private ComputerPart board = new Board();

    public void accept(IVisitor v) {
        this.cpu.accept(v);
        this.memory.accept(v);
        this.board.accept(v);
    }

    public static void main(String[] args) {
        PersonalVisitor p = new PersonalVisitor();
        new Computer().accept(p);
        System.out.println(p.totalPrice);
    }
}
