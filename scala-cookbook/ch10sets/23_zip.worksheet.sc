// 用zip将来嗯个序列集合合并为一对
val women = List("Wilma","Betty")
val men = List("Fred","Barney")
//创建了一个Tuple2元组的数组
val couples = women zip men
for((wife,husband) <- couples){
    println(s"$wife is married to $husband")
}
//一旦有一个元组，就可以把它转换为一个Map
val couplesMap = couples.toMap
//如果一个集合包含更多的元素，在较长集合结尾的元素会被忽略
val products = Array("breadsticks","pizza","soft drink")
val prices = Array(4)
val productsWithPrice = products.zip(prices)
// unzip与zip方法相反
val (a, b) = productsWithPrice.unzip