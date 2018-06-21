package com.avertia.exercises

object Solution {
  def main(args: Array[String]): Unit = {

    val Array(a,b,c,d) = args
    println(a)
    println(b)
    println(c)
    println(d)




    //val in = scala.io.StdIn.readLine()
    val in2 = "aaabaaaaccaaaaba"
    println ("(\\w)\\1+".r.replaceAllIn (in2, m => "$1" + m.toString.length))

    val regex = "(\\w)\\1+".r
    println(regex.pattern.split("$1"))

  }

}
