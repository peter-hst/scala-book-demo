val x = List(15,10,5,8,20,12)
// 集合拆分为谓词true/false的Map
val y1 = x.groupBy(_ > 10)
//以下三种会新建一个序列的Tuple2
val y2 = x.partition(_ > 10)
//由所有满足谓词的列表最长前缀和列表的余下部分组成
val y3 = x.span( _ < 20)
val y4 = x.splitAt(2)

//当结果返回一个Tuple2时，可使用下列方式访问
val (a,b) = x.partition( _ > 10 )
val groups = x.groupBy(_ > 10)
val trues = groups(true)
val falses = groups(false)
//sliding(size,step)可以把一个粗列分成多个组
val nums = (1 to 5).toArray
val num1 = nums.sliding(2).toList
val num2 = nums.sliding(2, 2).toList
val num3 = nums.sliding(2, 3).toList

//unzip方法可以用来截取Tuple2序列的值
val listOfTuple2s = List((1 , 2),('a' , 'b'))
val l1 = listOfTuple2s.unzip
//一个夫妻的列表，用unzip得到女人和男人的列表
val couples = List(("Kim","Al"),("Julia","Terry"))
val (women,men) = couples.unzip

/**
  * zip和unzip是相反的
  */