package com.example.specslice;

import java.io.IOException;
import org.junit.Test;

/**
 * This test checks that if undeclared fields are referenced by the target method, they are included
 * in the superclass.
 */
public class ThisSuperTest {
  @Test
  public void runTest() throws IOException {
    SpecSliceTestExecutor.runTestWithoutJarPaths(
        "thissuper",
        new String[] {"com/example/Simple.java"},
        new String[] {"com.example.Simple#bar()"});
  }
}
