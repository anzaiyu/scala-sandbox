val lst = List(List("A"), List("B", "C", "D", "E"))

lst match {
  case List(a@List("A"), x) =>
    println(a)
    println(x)
  case _ => println("nothing")
}