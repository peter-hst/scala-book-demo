/**
  * 数组排序
  */

  val fruits = Array("cherry","apple","banana")
  // StringOps隐式排序
  scala.util.Sorting.quickSort(fruits)
  println(fruits.mkString(","))
  //其他方式Ordered和Ordering特质
  /**
    * refs: Sorting对象 http://www.scala-lang.org/api/current/idex.html#scala.util.Sorting$
    *       Ordering特质 http://www.scala-lang.org/api/current/idex.html#scala.math.Ordering
    *       Ordered特质  http://www.scala-lang.org/api/current/idex.html#scala.math.Ordered
    */