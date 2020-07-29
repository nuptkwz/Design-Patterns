package com.designpatterns.designpatterns.templatemethod;

import lombok.extern.slf4j.Slf4j;

/**
 * Description
 * Date 2020/7/29 22:03
 * Created by kwz
 */
@Slf4j
public class Son1 extends Father {
    @Override
    void operation2() {
        log.info("Son1:operation2");
    }

    @Override
    void operation1() {
        log.info("Son1:operation1");
    }
}
