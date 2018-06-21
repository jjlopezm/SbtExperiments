package com.avertia.exercises

object exercise1 {
  def main(args: Array[String]): Unit = {
    List.range(1000,5555) filter(x=>x.toString==x.toString.reverse && x.toString.length>1) map(println)
  }

}
