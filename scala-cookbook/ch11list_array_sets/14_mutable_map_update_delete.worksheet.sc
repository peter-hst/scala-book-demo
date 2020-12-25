/**
  * 为可变映射添加、更新或删除元素
  */
 val states = scala.collection.mutable.Map[String,String]()
 states("AK") = "Alaska"
 
// += 添加元素
states += ("AL" -> "Alabama")
// 一次添加多个
states += ("AR"->"Arkansas", "AZ" -> "Arizona")

//从另一个集合添加多个元素
states ++= List("CA" -> "California", "CO" -> "Colorado")

// -= 方法删除元素
states -= "AR"
states -= ("AL", "AZ")
states --= List("AL","AZ")
val states2 = collection.mutable.Map(
    "AK" -> "Alaska",
    "IL" -> "Illionis",
    "KY" -> "Kentucky"
)
// put将集合的元素替换为集合另一个元素，旧值会返回
states2.put("CO","Colorado")
//retain保留映射中匹配谓词的元素
states2.retain((k,v) => k == "AK")
//remove返回里一个包含删除值的Option对象
val ak = states2.remove("AK")
println(ak.getOrElse("null"))
states2.clear