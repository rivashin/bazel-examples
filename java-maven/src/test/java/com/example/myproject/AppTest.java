package com.example.myproject;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Tests for correct dependency retrieval with maven rules.
 */
public class AppTest {

  @Test
  public void testCompare() throws Exception {
    App app = new App();
    assertEquals("should return 0 when both numbers are equal", 0, app.compare(1, 1));
  }

  @Test
  public void failingTest() throws Exception {
    assertEquals("should return 0 when both numbers are equal", 0, 21);
  }

}
