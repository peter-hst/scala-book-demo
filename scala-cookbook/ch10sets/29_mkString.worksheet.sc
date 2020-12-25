/**
  * 把集合转成一个字符串
  */
val a = Array("apple","banana","cherry")
val s1 = a.mkString
val s2 = a.mkString(" ")
val s3 = a.mkString(", ")
val s4 = a.mkString("[",",","]")

val b = Array(Array("a","b"), Array("c","d"))
val s5 = b.flatten.mkString(",")

val v = Vector("apple","bnana","cherry")
val s6 = v.toString