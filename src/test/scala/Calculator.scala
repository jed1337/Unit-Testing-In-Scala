import org.scalatest.flatspec.AnyFlatSpec

class Calculator extends AnyFlatSpec {
  behavior of "Calculator"
  val calculator = new Calculator()

  it should "Add two numbers" in {
    assert(calculator.sum(9, 12) == 21)
  }

  it should "Multiply two numbers" in {
    assert(calculator.multiply(4, 20) == 80)
  }

  class Calculator {
    def sum(n1: Int, n2: Int): Int = n1 + n2

    def multiply(n1: Int, n2: Int): Int = n1 * n2
  }
}
