package com.linkin.junit.impl;

import com.linkin.junit.inter.Subtracter;

/**
 * @author keith
 * @since 2016-03-08
 */
public class SubtracterImpl implements Subtracter {

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

}
