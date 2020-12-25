val ratings = Map(
    "Lady in the Water" -> 3.0,
    "Snakes on a Plane" -> 4.0,
    "You, Me and Dupree" -> 3.5
    )
 for((k,v) <- ratings) println(s"key: $k, value: $v")   
 ratings.foreach{
     case(movie,rating) => println(s"key: $movie, value: $rating")
 }
 ratings.foreach(x => println(s"key: ${x._1}, value: ${x._2}"))
 ratings.keys.foreach((rating) => println(rating))
 val x = collection.mutable.Map(1 -> "a", 2 -> "b")
 //val y - x.mapValues(_.toUpperCase)
val map = Map(1 -> 10, 2-> 20, 3-> 30)
val newMap = map.transform((k,v) => k + v)