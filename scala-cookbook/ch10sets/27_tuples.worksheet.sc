/**
  * 当需要一堆元素时是一年哦个元组
  */
val d = ("Debi",95)
case class Person(name:String)
val t = (3,"Three",new Person("Al"))
//通过下划线来访问元组中的元素
val t1 = t._1
val t2 = t._2
val t3 = t._3

//模式匹配来赋值
val (x,y,z) = t
println(s"x:$x, y:$y, z:$z")

//不需要元组中的所有元素,在不需要的地方用_通配符代替
val(j,k,_) = t
val(o, _, _) = t
val(r,_,u) = t
//两个元素的元组是Tuple2,三个元素的元组是Tuple2类的实例,最多22个
val m = "AL" -> "Alabama"
val n = ("AL" -> "Alabama")
println(n.getClass)
//这种语法对于其他用途非常方便，如创建maps
val map = Map("AL" -> "Alabama")
/**
  * 元组的一种常用场景是方法返回多个相聚
  * 尽管元组不是个集合，但需要创建一个迭代器时，可以把元组当作集合来处理
  */
val h = ("AL" -> "Alabama")
val it = h.productIterator
for(e <- it) println(e)

val arr = h.productIterator.toArray
/**
  * refs: https://www.scala-lang.org/api/current/index.html#scala.Tuple2
  */