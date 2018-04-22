import java.util.Locale

val obj: AnyRef = List("a")

obj match {
  case v: List[_] => println("List[_]")
}
