// 把一个包含列表的列表(序列)，创建为一个列表(序列)
val lol = List(List(1,2), List(3,4))
val result = lol.flatten
val a = Array(Array(1,2), Array(3,4))
val rs = a.flatten
//把一对夫妻的名字，转换称一个所有人的单列表名单
val couples = List(List("Kim","al"), List("julia","terry"))
val people = couples.flatten
val people2 = couples.flatten.map(_.capitalize).sorted
val people3 = couples.flatten.map(_.capitalize).sorted

val myFriends = List("Adam","David","Frank")
val adamsFriends = List("Nick K","Bill M")
val davidsFriends = List("Becca G","Kenny D","Bill M")
val friendsOfFriends = List(adamsFriends,davidsFriends)
val uniqueFriendsOfFriends = friendsOfFriends.flatten.distinct

val list = List("Hello","world")
val charList = list.flatten
//flatten对于Some和None元素很有有，把Some中的值取出来新建一个列表，然后丢掉None元素
val x = Vector(Some(1),None,Some(3),None)
x.flatten
//如果先用flatten，再用map可以直接用flatMap方法
//val people4 = couples.flatMap(_.capitalize)