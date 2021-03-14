package org.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class calculatorTest extends AnyFlatSpec {
  val calculator_test = new Calculator

  "calculator_test" should "return the correct addition" in {
    val result = calculator_test.add(100,100)
    assertResult(200)(result)
  }

  it should "return the negative number" in {
    val result = calculator_test.add(-16,8)
    assertResult(-8)(result)
  }

  it should "return the subtraction" in {
    val result = calculator_test.sub(16,8)
    assertResult(8)(result)
  }

  it should "return the negative value after subtraction" in {
    val result = calculator_test.sub(8,16)
    assertResult(-8)(result)
  }

  it should "return the correct multiplication" in {
    val result = calculator_test.mul(10,10)
    assertResult(100)(result)
  }

  it should "return the negative value after multiplication" in {
    val result = calculator_test.mul(10,-10)
    assertResult(-100)(result)
  }

  it should "return the correct division" in {
    val result = calculator_test.div(100,10)
    assertResult(10)(result)
  }

  it should "return the negative value after division" in {
    val result = calculator_test.div(-100,10)
    assertResult(-10)(result)
  }

  it should "return invalid as it is an exception" in {
    val result = calculator_test.div(100,0)
    assertResult(0)(result)
  }

  it should "return the correct result" in {
    val result = calculator_test.power(4,3)
    assertResult(64)(result)
  }

  it should "return the correct result when power is negative" in {
    val result = calculator_test.power(2,-3)
    assertResult(0.125)(result)
  }

  it should "return the correct absolute value" in {
    val result = calculator_test.absolute(-248)
    assertResult(248)(result)
  }

  it should "no change in the value" in {
    val result = calculator_test.absolute(3)
    assertResult(3)(result)
  }

  it should "return the modulus" in {
    val result = calculator_test.mod(45,3)
    assertResult(0)(result)
  }

  it should "return the negative value after taking mod" in {
    val result = calculator_test.mod(-16,3)
    assertResult(-1)(result)
  }

  it should "return the first number as maximum" in {
    val result = calculator_test.max(700,78)
    assertResult(700)(result)
  }

  it should "return the second number as maximum" in {
    val result = calculator_test.max(100,700)
    assertResult(700)(result)
  }

  it should "return the first number as minimum" in {
    val result = calculator_test.min(-55,3)
    assertResult(-55)(result)
  }

  it should "return the second number as minimum" in {
    val result = calculator_test.min(85,3)
    assertResult(3)(result)
  }

}