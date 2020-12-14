// Iterable在scala里并不常用，一般都会用到foreach，
// io.Source.fromFile方法是个好例子，它返回一个迭代器
//val it = collection.Iterable
//while(it.hasNext)

val it = Iterable(1,2,3)
it.foreach(println)
//第二次便利时，不会有任何输出，因为迭代器已结束
//迭代器不是一个集合，它给了一个接一个访问集合中元素的途径
it.foreach(println)
// 迭代器定义了很多在一个正常集合类中的可以看到的方法，如：foreach,map,flatmap,collect等
it.toArray