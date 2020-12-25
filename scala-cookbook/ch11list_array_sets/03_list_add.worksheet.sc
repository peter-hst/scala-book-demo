/**
  * 为List添加元素
  */
val x = List(2)
val y = 1::x
val z = 0::y


var l = List(2)
l = 1 :: l
l = 0 :: l
println(l)
// :: 方法是向右关联的，列表都是从右向左构造而成的
val list1 = 3 :: Nil
val list2 = 2 :: list1
val list3 = 1 :: list2

//注意任何以:结尾的方法都是从右向左执行，方法由右操作符调用
class Printer {
    def >>(i:Int) { println(s"$i") }
    def >>:(i:Int) { println(s"$i") }
}

val f1 = new Printer
f1 >> 42
//:结尾，它被用作右关联操作符
42 >>: f1

val o = List(1)
val p = 0 +: o
val q = o :+ 2