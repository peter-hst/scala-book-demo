/**
  * 利用Range创建集合
  */
val a = Array.range(1,5)
val l = List.range(0,10)
val v = Vector.range(0,10,2)
val a1 = (0 until 10).toArray
val l1 = 1 to 10 by 2 toList
val l2 = (1 to 10).by(2).toList
//Set是没有range方法
// val set = Set.range(0 until 10 by 2).toSet
val letters = ('a' to 'f').by(2).toList
for(i <- 1 until 10 by 2) println(i)

//创建其他类型的的序列
val map = (1 to 5).map(_ * 2.0)
val map2 = (1 to 5).map(e => (e, e))
val map3 = (1 to 5).map(e => (e,e)).toMap