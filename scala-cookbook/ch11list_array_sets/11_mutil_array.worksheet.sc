/**
  * 创建多维数组
  * 用Array.ofDim创建多维数组，这种方式最多创建五维数组
  */

val rows = 2
val cols = 3
val a = Array.ofDim[String](rows,cols)
a(0)(0) = "a"
a(0)(1) = "b"
a(0)(2) = "c"
a(1)(0) = "d"
a(1)(1) = "e"
a(1)(2) = "f"
val x = a(0)(0)
//遍历
for{
  i <- 0 until rows
  j <- 0 until cols
} println(s"($i)($j) = ${a(i)(j)}")

val x,y,z = 10
val arr = Array.ofDim[Int](x,y,z)
for{
  i <- 0 until x
  j <- 0 until y
  k <- 0 until z
} println(s"($i)($j)($k) = ${arr(i)(j)(k)}")

val arr2 = Array(Array("a","b","c"),Array("d","e"))
val a0 = arr2(0)
val a00 = arr2(0)(0)

var a1 = Array(Array("a","b","c"))
a1 ++= Array(Array("d","e"))
println(a1)