/**
  * 从List或ListBuffer中删除元素
  */
val orig = List(5,1,4,3,2)
val newList = orig.filter(_ > 2)

var x = List(5,1,4,3,2)
x = x.filter(_ > 2)
println(x)
// 使用filter, partition, splitAt, take等方法获取集合的子集

//ListBuffer
import scala.collection.mutable.ListBuffer
val l = ListBuffer(1,2,3,4,5,6,7,8,9)
l -= 5
println(l)
l -= (2,3)
println(l)
l.remove(0)
println(l)
l.remove(1,3)
println(l)
// --= 方法从指定集合中删除多个元素
val m = ListBuffer(1,2,3,4,5,6,7,8,9)
m --= Seq(1,2,3)
println(m)
/**
  * 这些符号(+:, /:, ::: 等)方法看上去令人望而生畏，但是-=和--=在可变集合中的用法发一致
  */