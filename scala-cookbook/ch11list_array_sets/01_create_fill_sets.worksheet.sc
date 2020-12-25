/**  本章针对以下集合类型：
 *  1.List
 *  2.Array,ArrayBuffer: Array是数组可变，一旦Array大小确定，它不能曾长也不能缩小
 *  3.Map
 *  4.Set
 *  创建和填充列表的不同方式
  */
//初始化List的方式
// ::也叫做cons
val list1 = 1 :: 2 :: 3 :: Nil
val list2 = List(1,2,3)
val x1 = List(1,2.0,33.0,4000.0)
val x2 = List[Number](1, 2.0, 33D,4000L)
val x3 = List.range(1,10)
val x4 = List.range(0,10,2)
val x5 = List.fill(3)("foo")
val x6 = List.tabulate(5)(n => n * n)
val x7 = collection.mutable.ListBuffer(1,2,3).toList
val x8 = "foo".toList
/**
  * List的重要属性：
  * 1.List是后进先出(LIFO),类似栈的访问模式
  * 2.List的前置，头尾访问的时间复杂度都是o(1)，对列表中元素的大多数操作都是o(n)
  * refs: http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.List
  */