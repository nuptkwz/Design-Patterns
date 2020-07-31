package com.designpatterns.designpatterns.command;

import lombok.extern.slf4j.Slf4j;

/**
 * Description
 * Date 2020/7/30 22:19
 * Created by kwz
 */
@Slf4j
public class CopyCommand extends Command {

    Content c;
    String strToInsert = "http://www.baidu.com";

    public CopyCommand(Content c) {
        this.c = c;
    }

    @Override
    public void doit() {
        c.msg = c.msg + c.msg;
        log.info(c.msg);
    }

    @Override
    public void undo() {
        c.msg = c.msg.substring(0, c.msg.length() / 2);
        log.info(c.msg);
    }
}
