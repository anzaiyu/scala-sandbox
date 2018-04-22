val lst = List("A", "B", "C", "D", "E")

lst match {
  case List("A", b, c, d, e) =>
    println("b = " + b)
    println("c = " + c)
    println("d = " + d)
    println("e = " + e)
  case _ =>
    println("nothing")
}
