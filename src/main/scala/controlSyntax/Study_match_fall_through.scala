"abc" match {
  case "abc" => println("first") //ここで処理が終了
  case "def" => println("second") //こっちは表示されない
}
