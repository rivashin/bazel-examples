package com.myp

object OneApp extends App {
  val one = new One
  Console.out.println(s"one.b = ${one.b}")
  Console.out.println(s"app = ${one.app}")
  Console.out.println(s"myjava = ${one.myjava.name()}")
  val a = (1 to 100)
}