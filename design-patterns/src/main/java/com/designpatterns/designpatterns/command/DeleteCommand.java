package com.designpatterns.designpatterns.command;

import lombok.extern.slf4j.Slf4j;

/**
 * Description
 * Date 2020/7/30 22:19
 * Created by kwz
 */
@Slf4j
public class DeleteCommand extends Command {

    Content c;
    String delete;

    public DeleteCommand(Content c) {
        this.c = c;
    }

    @Override
    public void doIt() {
        delete = c.msg.substring(0, 5);
        c.msg = c.msg.substring(5, c.msg.length());
        log.info(c.msg);
    }

    @Override
    public void undo() {
        c.msg = delete + c.msg;
        log.info(c.msg);
    }
}
