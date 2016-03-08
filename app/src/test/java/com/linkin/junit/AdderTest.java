package com.linkin.junit;

import com.linkin.junit.impl.AdderImpl;
import com.linkin.junit.inter.Adder;

import junit.framework.TestCase;

/**
 * @author keith
 * @since 2016-03-08
 */
public class AdderTest extends TestCase {

    Adder mAdder;

    @Override
    protected void setUp() throws Exception {
        mAdder = new AdderImpl();
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        mAdder = null;
        super.tearDown();
    }

    public void testAdd() {
        assertEquals(0, mAdder.add(0, 0));
        assertEquals(1, mAdder.add(0, 1));
        assertEquals(2, mAdder.add(1, 1));
        assertEquals(0, mAdder.add(1, -1));
        assertEquals(Integer.MAX_VALUE + 1, mAdder.add(1, Integer.MAX_VALUE));
        assertEquals(Integer.MIN_VALUE - 1, mAdder.add(-1, Integer.MIN_VALUE));
    }
}
