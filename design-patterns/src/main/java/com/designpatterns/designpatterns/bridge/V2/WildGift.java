package com.designpatterns.designpatterns.bridge.V2;

/**
 * Description
 * 冷酷型的礼物
 * Date 2020/7/30 21:46
 * Created by kwz
 */
public class WildGift extends Gift {

    public WildGift(GiftImpl impl) {
        this.impl = impl;
    }
}
