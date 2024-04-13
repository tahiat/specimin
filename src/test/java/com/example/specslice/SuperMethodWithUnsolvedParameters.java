package com.example.specslice;

import java.io.IOException;
import org.junit.Test;

/**
 * This test checks if Specimin can handle a method from a superclass with an unsolved parameter.
 */
public class SuperMethodWithUnsolvedParameters {
  @Test
  public void runTest() throws IOException {
    SpecSliceTestExecutor.runTestWithoutJarPaths(
        "supermethodwithunsolvedparameters",
        new String[] {"com/example/Simple.java"},
        new String[] {"com.example.Simple#bar()"});
  }
}
