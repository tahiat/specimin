package com.example.specslice;

import java.io.IOException;
import org.junit.Test;

/**
 * This test checks whether SpecSlice can handle a method from an interface that is implicitly
 * invoked and shares the same name as a method declared in the current class but with different
 * parameters.
 */
public class ImplicitInterfaceAccessMethodOverloadTest {
  @Test
  public void runTest() throws IOException {
    SpecSliceTestExecutor.runTestWithoutJarPaths(
        "implicitinterfaceaccessmethodoverload",
        new String[] {"com/example/Simple.java"},
        new String[] {"com.example.Simple#target(boolean)"});
  }
}
