package com.linkin.junit.impl;

import com.linkin.junit.inter.Diver;

/**
 * @author keith
 * @since 2016-03-08
 */
public class DiverImpl implements Diver {

    @Override
    public int divide(int a, int b) {
        return a / b;
    }

}
