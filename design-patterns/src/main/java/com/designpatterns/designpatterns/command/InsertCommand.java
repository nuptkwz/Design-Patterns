package com.designpatterns.designpatterns.command;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.PropertySource;

/**
 * Description
 * Date 2020/7/30 22:19
 * Created by kwz
 */
@Slf4j
public class InsertCommand extends Command {

    Content c;
    String strToInsert = "http://www.baidu.com";

    public InsertCommand(Content c) {
        this.c = c;
    }

    @Override
    public void doIt() {
        c.msg = c.msg + strToInsert;
        log.info(c.msg);
    }

    @Override
    public void undo() {
        c.msg = c.msg.substring(0, c.msg.length() - strToInsert.length());
        log.info(c.msg);
    }
}
