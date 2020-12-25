val states = Map("AL" -> "Alabama", "AK" -> "Alaska")
//创建一个空的可变map 之后再增加元素
var states2 = collection.mutable.Map[String,String]()
states2 += ("AL" -> "Alabama")
// Tuple2也可以这样创建映射
val states3 = Map(("AL","Alabama"),("AK","Alaska"))
/**
  * Map特质: http://www.scala-lang.org/api/current/index.html#scala.collection.Map
  * Predef对象： http://www.scala-lang.org/api/current/index.html#scala.Predef$
  */