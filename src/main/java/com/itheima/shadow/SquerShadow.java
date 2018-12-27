package com.itheima.shadow;

public class SquerShadow implements Shadow {
    @Override
    public double getShadow(double d) {
        return d*d;
    }
}
