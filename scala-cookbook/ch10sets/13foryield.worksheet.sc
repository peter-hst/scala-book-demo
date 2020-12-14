import scala.collection.mutable.ArrayBuffer
//把现有集合的元素通过算法转换为新的集合
val a = Array(1,2,3,4,5)
for(e <- a) yield e //产出一个集合副本
for(e <- a) yield e * 2 //新的集合，每个元素是原始的两倍
for(e <- a) yield e % 2 //每个元素的模

val fruits = Vector("apple","banana","lime","orange")
//每个元素的字符串转换为大写
val ucFruits = for(e <- fruits) yield e.toUpperCase
//把原始集合转换为Tuple2元素的序列
for(i <- 0 until fruits.length) yield (i, fruits(i))
//产出Tuple2元素的序列，每个元素包含每个原始字符串及其长度
for(i <- fruits) yield (i,i.length)
//算法需要多行可以放在yield后面的代码块中
val x = for(e <- fruits) yield {
    val s = e.toUpperCase
    s
}
//给一个Person类和一个朋友们的名在列表
case class Person(name:String)
val friends = Vector("Mark","Regina","Matt")
//产出Person实例集合
for(f <- friends) yield Person(f)
//for表达式加入if语句(守卫)来过滤元素
val x2 = for(e <- fruits if e.length < 6) yield e.toUpperCase
/**
  * for/yield语句组合就是for表达式或序列表达式
  * for/yield它还有一个存储去或临时存放区
  * for表达式返回的集合类型与开始使用的原始集合类型一样
  */
val fruit2 = ArrayBuffer("apple","banana")
val x3 = for(e <- fruit2) yield e.toUpperCase
//原始是List，for表达式产出List类型
val fruits3 = "apple"::"banana"::"orange"::Nil
val x4 = for(e <- fruits3) yield e.toUpperCase
val cars = Vector("Mercedes","Porsche","Tesla")
//如果没有一个匹配时，返回一个空的Vector
val x5 = for{
    c <- cars
    if c.startsWith("M")
} yield c