package com.itheima.factory;

import com.itheima.shadow.CircleShadow;
import com.itheima.shadow.Shadow;
import com.itheima.shadow.SquerShadow;
import com.sun.javafx.image.BytePixelSetter;

public class ShadowFactory {
    public Shadow getShadow(String str) {
        if (str.equalsIgnoreCase("circle")) {
            return new CircleShadow();
        } else if (str.equalsIgnoreCase("squer")) {
            return new SquerShadow();
        }else {
            throw new RuntimeException("您的心理阴影面积过大,请放弃治疗吧!");
        }
    }
}
