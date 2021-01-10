package com.designpatterns.designpatterns.command;

import lombok.extern.slf4j.Slf4j;

/**
 * Description 命令模式
 * command模式经常用来实现一个undo的功能
 * command就是用来封装各种各样命令的
 * <p>
 * 别名：Action/Transaction
 * Date 2020/7/30 22:15
 * Created by kwz
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
        Content content = new Content();
        InsertCommand insertCommand = new InsertCommand(content);
        insertCommand.doIt();
        insertCommand.undo();

        CopyCommand copyCommand = new CopyCommand(content);
        copyCommand.doIt();
        copyCommand.undo();

        DeleteCommand deleteCommand = new DeleteCommand(content);
        deleteCommand.doIt();
        deleteCommand.undo();

        log.info(content.msg);
    }
}
