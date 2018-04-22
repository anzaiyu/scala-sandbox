val one = 1

val hoge = one match {
  case 1 => "one"
  case 2 => "two"
  case _ => "other"
}

println(hoge)