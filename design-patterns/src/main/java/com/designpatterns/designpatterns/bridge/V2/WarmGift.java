package com.designpatterns.designpatterns.bridge.V2;

/**
 * Description
 * 温柔型的礼物
 * Date 2020/7/30 21:45
 * Created by kwz
 */
public class WarmGift extends Gift {
    
    public WarmGift(GiftImpl impl) {
        this.impl = impl;
    }
}
