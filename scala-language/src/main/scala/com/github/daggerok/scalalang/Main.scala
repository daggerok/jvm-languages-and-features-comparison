package com.github.daggerok.scalalang

case class Hello(message: String = "Hello", name: String = "Scala") {
  def greet() = s"$message, $name!"
}

object Main {
  def main(args: Array[String]): Unit = {
    println(Hello().greet())
  }
}
