// test: genlook2

/*
 * Copyright 2020, Google, LLC.
 * SPDX-License-Identifier: BSD-3-Clause
 */

package de.jflex.testcase.genlook2;

import de.jflex.testing.testsuite.golden.AbstractGoldenTest;
import de.jflex.testing.testsuite.golden.GoldenInOutFilePair;
import de.jflex.util.scanner.ScannerFactory;
import java.io.File;
import org.junit.Test;

/**
 * test that zzFin is properly updated when reallocating zzBuffer: bugs <a
 * href="http://sourceforge.net/p/jflex/bugs/118">#118</a> and <a
 * href="http://sourceforge.net/p/jflex/bugs/110">#110</a>
 *
 * <p>Note: This test was generated from {@code jflex-testsuite-maven-plugin} test cases. The test
 * relies on golden files for testing, expecting the scanner to output logs on the {@code
 * System.out}. Please migrate to proper unit tests, as describe in <a
 * href="https://github.com/jflex-de/jflex/tree/master/javatests/de/jflex/testcase">
 * //javatest/jflex/testcase</a>.
 */
// TODO Migrate this test to proper unit tests.
public class Genlook2GoldenTest extends AbstractGoldenTest {

  /** Creates a scanner conforming to the {@code genlook2.flex} specification. */
  private final ScannerFactory<Genlook2> scannerFactory = ScannerFactory.of(Genlook2::new);

  private final File testRuntimeDir = new File("javatests/de/jflex/testcase/genlook2");

  @Test
  public void goldenTest0() throws Exception {
    GoldenInOutFilePair golden =
        new GoldenInOutFilePair(
            new File(testRuntimeDir, "genlook2-0.input"),
            new File(testRuntimeDir, "genlook2-0.output"));
    compareSystemOutWith(golden);

    Genlook2 scanner = scannerFactory.createScannerForFile(golden.inputFile);
    while (!scanner.yyatEOF()) {
      System.out.println(scanner.yylex());
    }
  }
}
