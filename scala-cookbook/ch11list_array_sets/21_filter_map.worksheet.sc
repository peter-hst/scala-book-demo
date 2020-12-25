/**
  * 过滤映射
  */
var x = collection.mutable.Map(1 -> "a", 2 -> "b", 3 -> "c")
println(x)
//retain在可变映射中保留谓词为true的元素
x.retain((k,v) => k > 1)
println(x)
//transform不过滤元素，智慧改变可变映射中的元素
x.transform((k,v) => v.toUpperCase)
println(x)
// 不可变映射
val y = Map(1 -> "a", 2 -> "b", 3 -> "c")
val z = y.filterKeys(_ > 2)

def only1(i:Int) = if(i == 1) true else false
val x2 = y.filterKeys(only1)

val m = Map(1 -> "a", 2 -> "b", 3 -> "c")
val newMap = m.filterKeys(Set(2,3))
val m2 = m.filter((t) => t._2 == "c")
val m3 = m.take(2)