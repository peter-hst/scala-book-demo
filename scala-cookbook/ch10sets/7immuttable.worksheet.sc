// 明确理解不可变集合和不可变变量
val v = Vector("a","b","c")
val a = v(0)

val v1 = Vector(1,2,3)

//向一个不可变Vector新增元素，其结果赋予新的变量引用
val v2 = v1 ++ Vector(4,5)

//更新后的元素产生新的Vector，并赋予新的变量和Vector类型
val v3 = v2.updated(0,"x")
val v4 = v2.take(2)
val v5 = v2.filter( _ > 2)
/**
  * Vector:是一个解决里在列表里随机访问效率地下的集合类型(Scala2.8引入)。
  * Vector：可以在固定的时间内高效地访问列表中的任意元素。
  * Vector：在快速随机选取和快速随机更新放米哪做里很好的平衡，它是不可变索引序列的默认实现
  * 当有疑问时，用Vector，在Scala集合类库中Vector是最灵活高效的集合
  */
  // IndexedSeq实例默认为Vector实例
  val x = IndexedSeq(1,2,3) 