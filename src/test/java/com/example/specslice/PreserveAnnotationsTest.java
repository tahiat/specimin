package com.example.specslice;

import java.io.IOException;
import org.junit.Test;

/** This test checks if Specimin can preserve annotations as needed */
public class PreserveAnnotationsTest {
  @Test
  public void runTest() throws IOException {
    SpecSliceTestExecutor.runTest(
        "preserveannotations",
        new String[] {"com/example/Simple.java"},
        new String[] {"com.example.Simple#test()"},
        new String[] {"src/test/resources/shared/checker-qual-3.42.0.jar"});
  }
}
