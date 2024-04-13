package com.example.specslice;

import java.io.IOException;
import org.junit.Test;

/** This test checks if Specimin can properly remove an unsolved interface. */
public class UnsolvedInterfaceTest {
  @Test
  public void runTest() throws IOException {
    SpecSliceTestExecutor.runTestWithoutJarPaths(
        "unsolvedinterface",
        new String[] {"com/example/Foo.java"},
        new String[] {"com.example.Foo#doManyThing()"});
  }
}
