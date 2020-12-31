def nums = {
    var list = new java.util.ArrayList[Int]()
    list.add(1)
    list.add(2)
    list
}
val list = nums
list.forEach(println)

import scala.collection.JavaConverters.asScalaBuffer
val list2 = asScalaBuffer(nums)
list2.map(x -> x * x).foreach(println)