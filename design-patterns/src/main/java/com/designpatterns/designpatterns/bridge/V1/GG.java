package com.designpatterns.designpatterns.bridge.V1;

/**
 * Description
 * Date 2020/7/30 21:41
 * Created by kwz
 */
public class GG {
    public void chase(MM mm) {
        Gift g = new Book();
        give(mm, g);
    }

    private void give(MM mm, Gift g) {

    }
}
