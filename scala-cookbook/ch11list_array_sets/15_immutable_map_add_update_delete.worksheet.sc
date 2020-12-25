/**
  * 为不可变映射添加、更新或删除元素
  */
  import scala.collection.mutable.Map
val a = Map("AL" -> "Alabama")
val b = a + ("AK" -> "Alaska")
val c = b + ("AR" -> "Arkanasa","AZ" -> "Arizona")
val d = c + ("AR" -> "banana")
//删除
val e = d - "AR"
val f = e - "AZ" - "AL"

var x = Map("AL" -> "Alabama")
x += ("AK" -> "Alaska")
println(x)
x += ("AR" -> "Arkansas", "AZ" -> "Arizona")
println(x) 
x +=("AR" -> "banana")
println(x)

x -= "AR"
println(x)
x -= ("AL","AZ")
println(x)
val y = Map("CO" -> "Colorado")
x("AL") = "foo"