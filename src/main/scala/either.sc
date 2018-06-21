


def divideXByY(x: Int, y: Int): Either[String, Int] = {
  if (y == 0) Left("Dude, can't divide by 0")
  else Right(x / y)
}





List.range(1,50).filter(x=>x.toString==x.toString.reverse).map(x=> println(s""))
