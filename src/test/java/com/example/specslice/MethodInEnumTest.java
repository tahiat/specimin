package com.example.specslice;

import java.io.IOException;
import org.junit.Test;

/** This test checks if Specimin can handle a method inside an enum constant declaration. */
public class MethodInEnumTest {
  @Test
  public void runTest() throws IOException {
    SpecSliceTestExecutor.runTestWithoutJarPaths(
        "MethodInEnum",
        new String[] {"com/example/Foo.java"},
        new String[] {"com.example.Foo#bar()"});
  }
}
