package com.github.daggerok.scalalang

import org.junit.runner.RunWith
import org.scalatest.{FunSuite, Matchers}
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MainTest extends FunSuite with Matchers {
  test("should Hello, Scala!") {
    val hello = Hello()
    hello should not be None
    hello.message should not be None
    hello.greet() should equal("Hello, Scala!")

    val args = Array[String]()
    args should have size 0
    Main.main(args)
  }
}

