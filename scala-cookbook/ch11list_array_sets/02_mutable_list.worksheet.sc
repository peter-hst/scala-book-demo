/**
  * 创建可变List，相对于索引序列，线性序列，List是不可变的
  */

  import scala.collection.mutable.ListBuffer

  var fruits = new ListBuffer[String]()
  fruits += "Apple"
  fruits += "Banana"
  fruits += "Orange"
  fruits += ("Strawberry","Kiwi","Pineapple")
  //删除元素
  fruits -= "Apple"
  fruits -= ("Banana", "Orange")
  fruits --= Seq("Kiwi","Pineapple")
  //转换ListBuffer到List
  val fruitsList = fruits.toList
  /**
    * List是不可变的，如果经常改变列表，推荐使用ListBuffer
    * ListBuffer: 一个基于列表的缓冲实现，前置和附加操作的开销都是常量时间，其他大多数操作复杂度都是线性时间
    * 因此通过索引如list(10000)访问元素，就使用ArrayBuffer，而不是ListBuffer
    */
 val x = List(2)
 val y = 1 :: x 
 val z = 0 :: y  