/**
  * 访问映射的值
  */
val states = Map("AL" -> "Alabama", "AK" -> "Alaska", "AZ" -> "Arizona")

val az = states("AZ")
//以下代码抛异常
//val s = states("FOO")
val states2 = Map("AL" -> "Alabama").withDefaultValue("Not found")
states2("FOO")
//另一种使用getOrElse
val s = states.getOrElse("FOO","No such state")
//使用get返回Option
val az2 = states.get("AZ")
val foo = states.get("FOO")