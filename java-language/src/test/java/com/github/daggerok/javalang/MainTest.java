package com.github.daggerok.javalang;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

  @Test
  void test() {
    var args = new String[0];
    assertNotNull(args);
    Main.main(args);
  }
}
