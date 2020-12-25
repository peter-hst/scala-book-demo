/**
  * 反转映射的内容 值变键，键变值
  */
val products = Map(
    "Breadsticks" -> "$5",
    "Pizza" -> "$10",
    "Wings" -> "$5"
    )  
val reverseMap = for((k,v) <- products) yield (v,k) 