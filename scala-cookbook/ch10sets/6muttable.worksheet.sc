// 每次用 :+ 方法sisters变量会指向一个新的集合
var sisters = Vector("Melinda")
sisters = sisters :+ "Melissa"
sisters = sisters :+ "Marisa"
sisters.foreach(println)
//编译不通过
//sisters(0) = "Molly"

/**
  * var 是可变的变量，可以赋予一个新的数据
  * val 是不可变变量，不能被重新赋值
  * 可变集合：ArrayBuffer，不可变集合：Vector
  */