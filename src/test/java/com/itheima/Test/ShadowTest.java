package com.itheima.Test;

import com.itheima.factory.ShadowFactory;
import com.itheima.shadow.Shadow;

public class ShadowTest {
    public static void main(String[] args) {
        ShadowFactory factory = new ShadowFactory();
        Shadow circle = factory.getShadow("cirCLE");
        double shadow = circle.getShadow(2.3);
        System.out.println(shadow);

    }
}
