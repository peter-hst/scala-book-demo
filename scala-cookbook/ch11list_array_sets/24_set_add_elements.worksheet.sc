/**
  * 给集添加元素
  */
 
  var set = scala.collection.mutable.Set[Int]()
  set += 1
  set += (2,3)
  set += 2
  set ++= Vector(4,5)
  set.add(6)
  val b = set.contains(5)

  val s1 = Set(1,2)
  val s2 = s1 + 3
  val s3 = s2 + (4,5)
  val s4 = s3++ List(6,7)  
  val set2 = Set(1,2,3)
  set += 4
  println(set2)