/**
  * 从映射中获得所有的键或值
  */
 val states = Map("AK" ->"Alaska", "AL" -> "Alabama" ,"AR" -> "Arkansas")
 val kSet = states.keySet 
 val keys = states.keys
 // keyIterator和valuesIterator都返回一个迭代器
 val it = states.keysIterator

 val values = states.values
 val vIt = states.valuesIterator
