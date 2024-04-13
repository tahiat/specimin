package com.example.specslice;

import org.junit.Test;

import java.io.IOException;

/**
 * This test checks if Specimin can handle constraint type.
 */
public class ConstraintTypeTest {
  @Test
  public void runTest() throws IOException {
    SpecSliceTestExecutor.runTestWithoutJarPaths(
        "constraintType",
        new String[] {"com/example/Simple.java"},
        new String[] {"com.example.Simple#test(List<Baz>)"});
  }
}
