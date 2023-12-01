package org.checkerframework.specimin;

import org.junit.Test;

import java.io.IOException;

/**
 * This test checks that if Specimin will work if there is an unsolved, static field in a simple name form used by target methods
 */
public class UnsolvedStaticSimpleField {
  @Test
  public void runTest() throws IOException {
    SpeciminTestExecutor.runTestWithoutJarPaths(
        "unsolvedstaticsimplefield",
        new String[] {"com/example/Foo.java"},
        new String[] {"com.example.Foo#bar()"});
  }
}
