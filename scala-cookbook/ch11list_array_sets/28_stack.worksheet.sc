/**
 * 栈(LIFO) 有可变和不可变版本
 */
import scala.collection.mutable.Stack
var ints = Stack[Int]()
var fruits = Stack[String]()
case class Person(var name: String) 
var people = Stack[Person]()
val ints2 = Stack(1,2,3)

fruits.push("apple")
println(fruits)
fruits.push("banana")
println(fruits)
fruits.push("coconut","orange","pineapple")
println(fruits)
val next = fruits.pop
println(fruits)
//top在不删除的前提下查看下一个元素
val top = fruits.top
println(fruits)
fruits.size
fruits.isEmpty
fruits.clear
println(fruits)