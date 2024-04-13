package com.example.specslice;

import java.io.IOException;
import org.junit.Test;

/** This test checks if Specimin can create synthetic classes that extends Throwable type. */
public class ThrowableTypeTest {
  @Test
  public void runTest() throws IOException {
    SpecSliceTestExecutor.runTestWithoutJarPaths(
        "ThrowableType",
        new String[] {"com/example/Simple.java"},
        new String[] {"com.example.Simple#bar()"});
  }
}
