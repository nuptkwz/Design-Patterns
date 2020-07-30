package com.designpatterns.designpatterns.bridge.V2;

import lombok.extern.slf4j.Slf4j;

/**
 * Description
 * 用聚合代替继承
 * Date 2020/7/30 21:41
 * Created by kwz
 */
@Slf4j
public class GG {
    public void chase(MM mm) {
        Gift g = new WarmGift(new Flower());
        give(mm, g);
    }

    private void give(MM mm, Gift g) {
        log.info(g + "given!");
    }
}
