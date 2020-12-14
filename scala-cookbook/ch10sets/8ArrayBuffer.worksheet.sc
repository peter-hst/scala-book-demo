import scala.collection.mutable.ArrayBuffer
// ArrayBuffer一种用用的可变序列
val fruits = ArrayBuffer[String]()
val ints = ArrayBuffer[Int]()
val nums = ArrayBuffer(1,2,3)
//添加一个元素
nums += 4
//添加两个或更多的元素
nums += (5,6)
// 添加元素来自其他集合
nums ++= List(7,8)
// 使用-=或--=方法删除元素
nums -= 9
nums -= (7,8)
nums --= Array(5,6)
// 其他方式操作
val a = ArrayBuffer(1,2,3)
println(a.append(4))
//a.append(5, 6)
a.appendAll(Seq(7,8))
a.clear()

val b = ArrayBuffer(9,10)
b.insert(0,8)
b.insertAll(0,Vector(4,5))
b.prepend(3)
b.prepend(1,2)
b.appendAll(Array(0))

val c = ArrayBuffer.range('a','h')
c.remove(0)
c.remove(2,3)

val d = ArrayBuffer.range('a','h')
d.trimStart(2)
d.trimEnd(2)

/**
  * ArrayBuffer性能的细节信息: 追加，更新以及随机读取花费常数时间(摊销时间)。首部添加和删除根据buffer大小线性变化。
  * ArrayBuffer在高效地创建一个大集合时很游泳，无论新的元素是否总是添加到尾部
  * ListBuffer就像一个缓冲，它内部使用链表而不是数组
  */