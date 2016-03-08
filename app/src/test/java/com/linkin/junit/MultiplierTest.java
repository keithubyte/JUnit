package com.linkin.junit;

import com.linkin.junit.impl.MultiplierImpl;
import com.linkin.junit.inter.Multiplier;

import junit.framework.TestCase;

/**
 * @author keith
 * @since 2016-03-08
 */
public class MultiplierTest extends TestCase {

    Multiplier mMultiplier;

    @Override
    protected void setUp() throws Exception {
        mMultiplier = new MultiplierImpl();
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        mMultiplier = null;
        super.tearDown();
    }

    public void testMultiplier() {
        assertEquals(12, mMultiplier.multiply(3, 4));
        assertEquals(-12, mMultiplier.multiply(-3, 4));
        assertEquals(0, mMultiplier.multiply(0, 4));
        assertEquals(Integer.MIN_VALUE * Integer.MIN_VALUE, mMultiplier.multiply(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }
}
