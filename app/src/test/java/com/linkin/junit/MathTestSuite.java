package com.linkin.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author keith
 * @since 2016-03-08
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SubtracterTest.class,
        MultiplierTest.class
})
public class MathTestSuite {

/*    public static Test suite() {
        TestSuite suite = new TestSuite("com.linkin.junit");
        // 添加测试用例
        suite.addTest(new JUnit4TestAdapter(AdderTest.class));
        suite.addTest(new JUnit4TestAdapter(DiverTest.class));
        return suite;
    }*/

}
