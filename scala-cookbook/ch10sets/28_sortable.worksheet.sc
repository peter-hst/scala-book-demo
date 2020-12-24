/**
  * 集合排序
  * 需要在一个自定义类中实现有序的特质，这样可以用排序方法<, <=, > 和 >= 操作付去比较类的实例。
  * sorted方法可以对具有Double，Float，Int和任何有隐式scala.math.Ordering的其他类型集合进行排序
  */
val a = List(10,5,8,1,7).sorted
val b = List("banana","pear","apple","orange").sorted
val l1 = List(10,5,8,1,7).sortWith(_ < _)
val l2 = List(10,5,8,1,7).sortWith(_ > _)
val l3 = List("banana","pear","apple","orange").sortWith(_ < _)
val l4 = List("banana","pear","apple","orange").sortWith(_ > _)
val l5 = List("banana","pear","apple","orange").sortWith(_.length < _.length)
val l6 = List("banana","pear","apple","orange").sortWith(_.length > _.length)
//排序算法较长，可以把算法封装在方法里
def sortByLength(s1:String, s2:String) = {
    println("comparing %s and %s".format(s1,s2))
    s1.length > s2.length
}
val l7 = List("banana","pear","apple","orange").sortWith(sortByLength)
//如果序列的元素没有隐式的Ordering，哪就不能用sorted排序
class Person(var name:String){
    override def toString(): String = name
}
val ty = new Person("Tyler")
val al = new Person("Al")
val paul = new Person("Paul")
val dudes = List(ty,al,paul)
//以下代码编译报错，因为Person类没隐式Ordering
//dudes.sorted

class Person2(var name:String) extends Ordered[Person2]{
    override def toString(): String = name
    def compare(that: Person2): Int = {
        if(this.name == that.name) 0 else if(this.name > that.name) 1 else -1
    }
}
//以下可编译
val ty2 = new Person2("Tyler")
val al2 = new Person2("Al")
val paul2 = new Person2("Paul")
val dudes2 = List(ty2,al2,paul2)
dudes2.sorted