package com.linkin.junit;

import com.linkin.junit.impl.SubtracterImpl;
import com.linkin.junit.inter.Subtracter;

import junit.framework.TestCase;

/**
 * @author keith
 * @since 2016-03-08
 */
public class SubtracterTest extends TestCase {

    Subtracter mSubtracter;

    @Override
    protected void setUp() throws Exception {
        mSubtracter = new SubtracterImpl();
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        mSubtracter = null;
        super.tearDown();
    }

    public void testSubtracter() {
        assertEquals(0, mSubtracter.subtract(5, 5));
        assertEquals(Integer.MAX_VALUE, mSubtracter.subtract(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MIN_VALUE, mSubtracter.subtract(Integer.MIN_VALUE, 0));
        assertEquals(Integer.MAX_VALUE - Integer.MIN_VALUE,
                mSubtracter.subtract(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }
}
