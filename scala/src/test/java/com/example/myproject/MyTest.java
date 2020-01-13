package com.example.myproject;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Tests for correct dependency retrieval with maven rules.
 */
public class MyTest {

  @Test
  public void foo() throws Exception {
    App app = new App();
    assertEquals("should return 0 when both numbers are equal", 0, app.compare(1, 1));
  }

  @Test
  public void bar() throws Exception {
    assertEquals("should return 0 when both numbers are equal", 0, 21);
  }

}
