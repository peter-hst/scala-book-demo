/**
  * 合并或连接两个列表
  */
 val a = List(1,2,3)
 val b = List(4,5,6)
 val c = a ++ b 
 // :::也是一种从两个列表创建新列表的方式
 val d = a ::: b
 val e = List.concat(a,b)
 /**
   * 牢记List类优点：List类是最佳的后进先出(LIFO)，栈的访问模式
   * refs: http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.List
   */
