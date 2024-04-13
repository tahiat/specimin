package com.example.specslice;

import java.io.IOException;
import org.junit.Test;

/** This test checks if Specimin can work when there is an unsolved union type. */
public class UnionTypeTest {
  @Test
  public void runTest() throws IOException {
    SpecSliceTestExecutor.runTestWithoutJarPaths(
        "uniontype",
        new String[] {"com/example/Simple.java"},
        new String[] {"com.example.Simple#bar()"});
  }
}
