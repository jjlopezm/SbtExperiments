package com.avertia.rational

object RationalCalculator{

  def main(args: Array[String]): Unit = {
    println("Rational Numbers Calculator API. Please import com.avertia.rational.Rational in your" +
      " project")

    val firstRational = new Rational(5,3)
    val secondRational = new Rational(6,4)

    val res = firstRational * secondRational

    val msg =
      s"""Use example:
         | val firstRational = new Rational(5,3)
         | val secondRational = new Rational(6,4)
         | val res = firstRational * secondRational
         | println(s"$$firstRational * $$secondRational = $$res")
       """.stripMargin

    println(msg)
  }

}
