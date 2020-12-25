/**
  * 选择一种Map实现
  */
//返回元素按键有序的映射，使用SortedMap
import scala.collection.SortedMap
val  grades = SortedMap("Kim" -> 90, "Al" -> 85, "Melissa" -> 95, "Emily" -> 91, "Hannah" -> 92)

//按插入元素的顺序，使用LinkedHashMap或ListMap，Scala只有可变的LinkedHashMap
import scala.collection.mutable.LinkedHashMap
var states = LinkedHashMap("IL" -> "Illinois")
states += ("KY" -> "KentuckyK")
states += ("TX" -> "Texas")
/**
  * Scala还提供其他集中映射类型，内建里并行/并发实现
  * collection.parallel.immutable.ParHashMap
  * collection.parallel.mutable.ParHashMap
  * collection.concurrent.TrieMap
  * Map: http://docs.scala-lang.org/overviews/collections/maps.html
  * 并发集合: http://docs.scala-lang.org/overviews/parallel-collections/overview.html
  */