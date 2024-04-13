package com.example.specslice;

import org.junit.Test;

import java.io.IOException;

/**
 * This test checks if Specimin can handle fields of type primitive array.
 */
public class PrimitiveArrayTest {
  @Test
  public void runTest() throws IOException {
    SpecSliceTestExecutor.runTestWithoutJarPaths(
        "primitivearray",
        new String[] {"com/example/Simple.java"},
        new String[] {"com.example.Simple#bar()"});
  }
}
