package com.linkin.junit.impl;

import com.linkin.junit.inter.Multiplier;

/**
 * @author keith
 * @since 2016-03-08
 */
public class MultiplierImpl implements Multiplier {

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

}
