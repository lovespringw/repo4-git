package com.itheima.shadow;

import com.itheima.shadow.Shadow;

public class CircleShadow implements Shadow {
    public static final double PI = 3.1415926;

    @Override
    public double getShadow(double d) {

        return PI*d*d;
    }
}
