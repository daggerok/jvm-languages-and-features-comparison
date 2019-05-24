package com.github.daggerok.kotlinlang

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MainKtTest {

  @Test
  internal fun test() {
    val args = arrayOf<String>()
    assertNotNull(args)
    main(args)
  }
}
