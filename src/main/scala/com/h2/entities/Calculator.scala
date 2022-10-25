package com.h2.entities

class Calculator {
  def +(n1: Int, n2: Int): Int = n1 + n2

  def +(n1: Double, n2: Double): Double = n1 + n2

  def /(n1: Double, n2: Double): Double =
    n2 match {
      case 0 => throw new IllegalArgumentException("Division by 0")
      case _ => n1 / n2
    }
}
