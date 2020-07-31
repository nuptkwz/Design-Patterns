package com.designpatterns.designpatterns.command;

/**
 * Description
 * Date 2020/7/30 22:17
 * Created by kwz
 */
public abstract class Command {
    public abstract void doit();//exec run

    public abstract void undo();
}
