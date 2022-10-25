package com.h2.entities

import org.scalatest.flatspec.AnyFlatSpec

class CalculatorSpec extends AnyFlatSpec {
  behavior of "Calculator"
  val calculator = new Calculator()

  it should "Allow addition of Integers" in {
    assertResult(3) {
      calculator.+(1, 2)
    }
  }

  it should "Allow addition of Doubles" in {
    assert(calculator.+(3.14, 1.06) == 4.2)
  }

  it should "Allow division of Doubles" in {
    assertResult(23) {
      calculator./(69, 3)
    }
  }

  it should "Throw an error on division by 0" in{
    assertThrows[IllegalArgumentException]{
      calculator./(42,0)
    }
  }
}
