import com.avertia.rational.Rational

val a = new Rational(1, 1)


implicit val miPrimerImplicito = " esto es un implicito"



def concatenaConImplicito(s: String)(implicit sConcat: String): String = {
  s + sConcat
}

concatenaConImplicito("hola")



val b = new Rational(1, 2)
//println(b.simplify)


object ProbandoImplicitos {

  implicit class masFuncionesParaRational(r: Rational) {
    def simplify: String = {
      if (r.numer % r.denom == 0)
        (r.numer / r.denom).toString
      else
        r.toString
    }
  }
}




import ProbandoImplicitos._

val c = new Rational(1, 1)
c.simplify




