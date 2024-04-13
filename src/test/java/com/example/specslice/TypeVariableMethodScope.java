package com.example.specslice;

import java.io.IOException;
import org.junit.Test;

/**
 * This test checks if Specimin can handle a method scope with a type parameter, such as "I field;
 * field.get();".
 */
public class TypeVariableMethodScope {
  @Test
  public void runTest() throws IOException {
    SpecSliceTestExecutor.runTestWithoutJarPaths(
        "typevariablemethodscope",
        new String[] {"com/example/Simple.java"},
        new String[] {"com.example.Simple#bar()"});
  }
}
