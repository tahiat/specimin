package com.example.specslice;

import java.io.IOException;
import org.junit.Test;

/**
 * This test checks if Specimin can properly update the list of target files to be solved by
 * UnsolvedSymbolVisitor in case there is an unsolved field from a class that is not added as a
 * target file.
 */
public class UnsolvedFieldsInExistingClassTest {
  @Test
  public void runTest() throws IOException {
    SpecSliceTestExecutor.runTestWithoutJarPaths(
        "unsolvedfieldsinexistingclass",
        new String[] {"com/example/Foo.java"},
        new String[] {"com.example.Foo#bar()"});
  }
}
