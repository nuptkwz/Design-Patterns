package com.designpatterns.designpatterns.templatemethod;

import lombok.extern.slf4j.Slf4j;

/**
 * Description
 * Date 2020/7/29 22:03
 * Created by kwz
 */
@Slf4j
public class Son2 extends Father {
    @Override
    void operation2() {
        log.info("Son2:operation2");
    }

    @Override
    void operation1() {
        log.info("Son2:operation1");
    }
}
