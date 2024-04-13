package com.example.specslice;

import java.io.IOException;
import org.junit.Test;

/** This test checks if Specimin can work when there is the var keyword in the input test. */
public class VarTypeTest {
  @Test
  public void runTest() throws IOException {
    SpecSliceTestExecutor.runTestWithoutJarPaths(
        "vartype",
        new String[] {"com/example/Simple.java"},
        new String[] {"com.example.Simple#bar()"});
  }
}
