/**
  * map中找最大值或键
  */

  val grades = Map("Al" -> 80, "Kim" -> 95, "Teri" -> 85, "Julia" -> 90)
  //最大键
  val max1 = grades.max
  val max2 = grades.keysIterator.max
  val max3 = grades.keysIterator.reduceLeft((x,y) => if(x > y)x else y)
  val max4 = grades.keysIterator.reduceLeft((x,y) => if(x.length > y.length) x else y)
  val max5 = grades.valuesIterator.max 
  val max6 = grades.valuesIterator.reduceLeft(_ max _)