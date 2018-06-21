import scala.concurrent.Future
import scala.util.{Failure, Success, Try}

val a = "5"
val b = "6"

def divide: Try[Int] = {
//  val dividend = Try(Console.readLine("Enter an Int that you'd like to divide:\n").toInt)
//  val divisor = Try(Console.readLine("Enter an Int that you'd like to divide by:\n").toInt)

  val dividend = Try(a.toInt)
  val divisor = Try(b.toInt)
  val problem = dividend.flatMap(x => divisor.map(y => x/y))
  problem match {
    case Success(v) =>
      println("Result of " + dividend.get + "/"+ divisor.get +" is: " + v)
      Success(v)
    case Failure(e) =>
      println("You must've divided by zero or entered something that's not an Int. Try again!")
      println("Info from the exception: " + e.getMessage)
      divide
  }
}

divide


val a = Future


