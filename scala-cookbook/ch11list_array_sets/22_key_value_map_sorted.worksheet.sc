/**
  * 根据键或值对映射排序
  */
val grades = Map(
    "Kim" -> 90,
    "Melissa" -> 95,
    "Emily" -> 91,
    "Hananh" -> 92
    )

import scala.collection.immutable.ListMap
val lMap = ListMap(grades.toSeq.sortBy(_._1): _*)
// low to high
val lMap2 = ListMap(grades.toSeq.sortWith(_._1 < _._1 ):_*)
// high to low
val lMap3 = ListMap(grades.toSeq.sortWith(_._1 > _._1):_*) 
// sortBy 
val lMap4 = ListMap(grades.toSeq.sortBy(_._2):_*)

val lMap5 = ListMap(grades.toSeq.sortWith(_._2 < _._2):_*)
val lMap6 = ListMap(grades.toSeq.sortWith(_._2 < _._2):_*)
grades.foreach(println)

val gSeq1 = grades.toSeq
val gSeq2 = grades.toSeq.sortBy(_._1)
val gSeq3 = grades.toSeq.sortWith(_._1 < _._1)
val gSeq4 = LiatMap(grades.toSeq.sortBy(_._1):_*)
/**
  * 关于_*  它的作用是将数据转换，然后将其作为多个参数传给ListMap或LinkedHashMap
  * 
  */
val x = grades.toSeq.sortBy(_._1)  
ListMap(x:_*)
ListMap(x)
def printAll(strings:String*) {
    strings.foreach(println)
}
printAll(grades.toSeq: _*)

// 可以将_* 看作 * 操作符