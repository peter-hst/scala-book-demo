val days = Array("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
// zipWithIndex返回了一些列由Tuple2元素组成的数组：Array((Sunday,0),(Monday,1))
// case 语句匹配一个Tuple2
days.zipWithIndex.foreach {
    case(day,count) => println(s"$count is $day")
}

for((day,count) <- days.zipWithIndex) println(s"$count is $day")
// 当使用zipWithIndex时，它返回一个Tuple2元素序列
// zipWithIndex从已有的序列创建一个新的序列
val list = List("a","b","c").zipWithIndex

//调用zipWithIndex之前，先调用view，此时创建里一个惰性视图
val zwi = list.view.zipWithIndex

days.zipWithIndex.foreach{d => println(s"${d._2} is ${d._1}")}
