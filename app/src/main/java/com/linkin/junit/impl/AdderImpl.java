package com.linkin.junit.impl;

import com.linkin.junit.inter.Adder;

/**
 * @author keith
 * @since 2016-03-08
 */
public class AdderImpl implements Adder {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

}
