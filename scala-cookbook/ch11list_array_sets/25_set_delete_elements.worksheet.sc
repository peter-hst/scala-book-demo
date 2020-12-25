/**
  * 从集中删除元素
  */
var set = scala.collection.mutable.Set(1,2,3,4,5)
println(set)
set -= 1
println(set)
set --= Array(4,5)
println(set)
set -= (2,3)
println(set)
set.retain(_ > 2)  
println(set)
set.clear

set = scala.collection.mutable.Set(1,2,3,4,5)
set.remove(2)
set.remove(40)
// 不可变集
val s1 = Set(1,2,3,4,5,6)
val s2 = s1 - 1
val s3 = s2 - (2, 3)
val s4 = s3 -- Array(4,5)

val ss1 = Set(1,2,3,4,5,6)
val ss2 = ss1.filter(_ > 3)
val ss3 = ss1.take(2)