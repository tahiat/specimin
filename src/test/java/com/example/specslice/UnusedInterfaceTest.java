package com.example.specslice;

import java.io.IOException;
import org.junit.Test;

/** This test checks if Specimin can properly remove unused interfaces. */
public class UnusedInterfaceTest {
  @Test
  public void runTest() throws IOException {
    SpecSliceTestExecutor.runTestWithoutJarPaths(
        "unusedinterface",
        new String[] {"com/example/Foo.java"},
        new String[] {"com.example.Foo#doManyThing()"});
  }
}
