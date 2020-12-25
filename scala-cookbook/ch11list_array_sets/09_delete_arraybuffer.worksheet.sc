/**
  * 删除Array和ArrayBuffer元素
  */
import scala.collection.mutable.ArrayBuffer

val x = ArrayBuffer('a','b','c','d','e')
x -= 'a'
x -= ('b','c')
// 使用 --= 删除定义在另一个集合(继承TraversableOnce的任意集合)
val y = ArrayBuffer('a','b','c','d','e')
println(y)
y --= Seq('a','b')
println(y)
y --= Array('c')
println(y)
y --= Set('d')
println(y)

val z = ArrayBuffer('a','b','c','d','e','f')
println(z)
z.remove(0)
println(z)
z.remove(1,3)
println(z)

val z2 = ArrayBuffer(1,2,3,4,5)
z2.clear
println(z2)
// Array
val a = Array("apple","banana","cherry")
println(a.mkString(","))
a(0) = ""
println(a.mkString(","))
a(1) = null
println(a.mkString(","))

val b = Array("apple","banana","cherry")
println(b.mkString(","))
val c = b.filter(!_.contains("apple"))
println(c.mkString(","))
// drop,slice,take等过滤
var d = Array("apple","banana","cherry")
d = d.take(2)
println(d.mkString(","))
