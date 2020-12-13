/**
 * 1. 谓词:一个方法/函数/匿名函数,接受一个或多个参数,返回一个Boolean值
 * 2. 匿名函数
 * 3. 隐式循环(implied loops)
 */
def isEven (i:Int) = if(i % 2 == 0) true else false //方法定义
val isEven2 = (i:Int) => i % 2 == 0
val isEven3 = _ % 2 == 0 //匿名函数

val list = List.range(1,10)
// 隐式转换 filter会遍历集合每个元素返回一个新的集合
val evens = list.filter(isEven3)
val evensList = for { // 跟filter等价
    e <- list
    if e % 2 == 0
} yield e

/**
  * 集合从Traversable和Iterable特质开始,扩展到三个主要类别: Seq, Set和Map
  * Traversable遍历整个集合,如foreach实现所有集合的通用方法,可反复遍历
  * Iterable是一个迭代器,集合值可被循环一次
  */
  val v = Vector(1,2,3)
  val s = v.sum
  val vFilter = v.filter(_ > 1)
  val vMap = v.map(_ * 2)

  val x = IndexedSeq(1,2,3)
  val seq = scala.collection.immutable.LinearSeq(1,2,3)

  val m = Map(1 -> "a" , 2 -> "b")
  val mm = scala.collection.mutable.Map(1 -> "a", 2 -> "b")

  val set = Set(1,2,3)
  val set2 = collection.mutable.Set(1,2,3)