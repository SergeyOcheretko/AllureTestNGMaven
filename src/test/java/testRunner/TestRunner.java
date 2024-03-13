package testRunner;

import org.testng.TestNG;
import org.testng.annotations.*;
import testSuite.TestInteractWithInputAndButtonFieldsSuite;

public class TestRunner {

    @Test
    public void runTestSuite() {
        TestNG testng = new TestNG();
        Class<?>[] classes = { TestInteractWithInputAndButtonFieldsSuite.class };
        testng.setTestClasses(classes);
        testng.run();
    }
}
