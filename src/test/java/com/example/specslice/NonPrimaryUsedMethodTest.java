package com.example.specslice;

import java.io.IOException;
import org.junit.Test;

/** This test checks if Specimin can handle used methods in non-primary classes. */
public class NonPrimaryUsedMethodTest {
  @Test
  public void runTest() throws IOException {
    SpecSliceTestExecutor.runTestWithoutJarPaths(
        "nonprimaryusedmethod",
        new String[] {"com/example/Foo.java"},
        new String[] {"com.example.Foo#bar()"});
  }
}
