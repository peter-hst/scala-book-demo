/**
  * 把两个序列合并为一个序列
  * ++= 把一个序列合并为一个可变序列
  * ++ 合并两个可变or不可变序列
  * union，diff和intersect等集合方法
  */

val a = collection.mutable.ArrayBuffer(1,2,3)
//合并一个序列
a++=Seq(4,5,6)

val a1 = Array(1,2,3)
val b1 = Array(4,5,6)
val c1 = a1 ++ b1

val a2 = Array(1,2,3,4,5)
val b2 = Array(4,5,6,7,8)
//交集
val c2 = a2.intersect(b2)
//合并2个集合的所有元素
val c3 = a2.union(b2)
//并集，合并2个集合去掉重复的元素
val c4 = a2.union(b2).distinct
//diff的结果取决于在哪个序列上调用
//diff：一个新列表，该列表包含this列表的所有元素，但不包含that中同样出现的元素。
// 如果一个元素值x在that中出现了N次，那么这些元素都不会成为结果的一部分，但之后出现的会。
val c5 = a2 diff b2
val c6 = b2 diff a2
// 合并
val c7 = Array.concat(a2,b2)

// :::方法会把一个列表的元素前置放到另一个列表中
val list = List(1,2,3,4)
val list2 = List(4,5,6,7)
val all = list ::: list2

// 注意：diff获得两个集合相对的补集
// 对于集合A相对于集合B的相对补集就是在B中出现但不在A中的元素
val j = Array(1,2,3,11,4,12,4,5)
val k = Array(6,7,4,5)
val m = j.toSet diff k.toSet
val n = k.toSet diff j.toSet
val o = m ++ n
val p = j.intersect(k)
val q = j.toSet -- k.toSet
val r = k.toSet -- j.toSet