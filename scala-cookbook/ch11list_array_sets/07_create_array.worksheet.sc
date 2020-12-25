/**
  * 创建和选择性地填充一个数组
  */
 val a = Array(1,2,3)
 val fruitArray = Array("Apple","Banana","Orange") 
 val x = Array(1,2.0,33D,400L)
 val x2 = Array[Number](1,2.0,33D,400L)

 //定义一个初始化大小数组和类型，之后再填充
 val fruits = new Array[String](3)
 fruits(0) = "Apple"
 fruits(1) = "Banana"
 fruits(2) = "Orange"

 val x3 = Array.range(1, 10)
 val x4 = Array.range(0, 10, 2)
 val x5 = Array.fill(3)("foo")
 val x6 = Array.tabulate(10)(n => n * n )
 val x7 = "Hello".toArray
 /**
   * Array可变是指内部元素可改变，不可变是指长度声明后不可变 同Java
   */
  val n = Array(1,2,3)
  println(n(0))
  n(0) = 10
  n(1) = 20
  println(n.mkString(","))