package com.example.specslice;

import java.io.IOException;
import org.junit.Test;

/**
 * This test checks that if Specimin will work properly where there are two classes with the same
 * name
 */
public class SameClassName {
  @Test
  public void runTest() throws IOException {
    SpecSliceTestExecutor.runTestWithoutJarPaths(
        "sameclassname",
        new String[] {"com/example/Simple.java"},
        new String[] {"com.example.Simple#secondCalculator()"});
  }
}
