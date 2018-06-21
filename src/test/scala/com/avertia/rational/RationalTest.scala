package com.avertia.rational

import org.scalatest.{FlatSpec, Matchers}

class RationalTest extends FlatSpec with Matchers {

  trait WithRationalValues {
    val op1 = new Rational(5,3)
    val op2 = new Rational(8/2)
  }

  "Rational" should "write like a fraction its elements" in new WithRationalValues {
    op1.toString shouldBe "5/3"
    op2.toString shouldBe "4/1"
  }

  it should "perform operator +" in new WithRationalValues {
    (op1 + op2).toString shouldBe "17/3"
  }

}
