package com.example.specslice;

import java.io.IOException;
import org.junit.Test;

/**
 * This test checks that when SpecSlice puts a field into a superclass, any constraints on that
 * field's type based on assignments in the target method(s) are respected.
 */
public class FieldCorrectPrimitiveTest {
  @Test
  public void runTest() throws IOException {
    SpecSliceTestExecutor.runTestWithoutJarPaths(
        "fieldcorrectprimitive",
        new String[] {"com/example/Simple.java"},
        new String[] {"com.example.Simple#bar()"});
  }
}
