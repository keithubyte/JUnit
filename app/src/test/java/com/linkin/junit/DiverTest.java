package com.linkin.junit;

import com.linkin.junit.impl.DiverImpl;
import com.linkin.junit.inter.Diver;

import junit.framework.TestCase;

/**
 * @author keith
 * @since 2016-03-08
 */
public class DiverTest extends TestCase {

    Diver mDiver = new DiverImpl();

    @Override
    protected void setUp() throws Exception {
        mDiver = new DiverImpl();
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        mDiver = null;
        super.tearDown();
    }

    public void testDiver() {
        assertEquals(4, mDiver.divide(12, 3));
        assertEquals(-4, mDiver.divide(12, -3));
        assertEquals(2, mDiver.divide(12, 5));
        assertEquals(0, mDiver.divide(12, 22));
    }
}
