/**
  * Range
  */
val r1 = 1 to 10
val r2 = 1 until 10
val r3 = 1 to 10 by 2
val r4 = 'a' to 'c'
val x1 = (1 to 10).toList
val x2 = (1 to 10).toArray
val x3 = (1 to 10).toSet
val x4 = Array.range(1, 10)
val x5 = Vector.range(1, 10)
val x6 = List.range(1,10)
val x7 = List.range(0,10,2)
val x8 = collection.mutable.ArrayBuffer.range('a','d')
for(i <- 1 to 3) println(i)
val x9 = (1 to 5).map{e => (e+1.1) * 2}
val x10 = List.tabulate(5)(_ + 1)
val x11 = Vector.tabulate(5) (_ * 2)
/**
  * refs: http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.Range
  */