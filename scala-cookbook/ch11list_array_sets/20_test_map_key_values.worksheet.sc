/**
  * 测试映射是否包含指定的键或值
  */
val states = Map(
    "AK" -> "Alaska",
    "IL" -> "Illinois",
    "KY" -> "Kentucky"
)  
if(states.contains("FOO0")) println("Found foo") else println("No foo")

states.valuesIterator.exists(_.contains("ucky"))
states.valuesIterator.exists(_.contains("yucky"))