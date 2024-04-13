package com.example.specslice;

import java.io.IOException;
import org.junit.Test;

/** This test checks if Specimin can handle multiple level inheritance. */
public class MultiLevelInheritanceTest {
  @Test
  public void runTest() throws IOException {
    SpecSliceTestExecutor.runTestWithoutJarPaths(
        "multilevelinheritance",
        new String[] {"com/example/Foo.java"},
        new String[] {"com.example.Foo#bar()"});
  }
}
