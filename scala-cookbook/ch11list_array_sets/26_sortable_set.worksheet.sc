/**
  * 使用可排序集
  */
val s = scala.collection.SortedSet(10,4,8,2)
val s2 = scala.collection.SortedSet("cherry","kiwi","apple")
val s3 = scala.collection.mutable.LinkedHashSet(10,4,8,2)
// SortedSet只有不可变版本，若想用可变版本请用Java的TreeSet,LinkedHashSet
class Person(var name:String)
import scala.collection.SortedSet

val aleka = new Person("Aleka")
val christina = new Person("Christina")
val molly = new Person("Molly")
val tyler = new Person("Tyler")
//不能编译，person类没有实现Ordered特质并实现compare方法
//val sss = SortedSet(molly,tyler,christina,aleka)
class Person2(var name:String) extends Ordered[Person2]{
    def compare(that: Person2): Int = if(this.name == that.name) 0 else if(this.name > that.name) 1 else -1
} 

val aleka2 = new Person2("Aleka")
val christina2 = new Person2("Christina")
val molly2 = new Person2("Molly")
val tyler2 = new Person2("Tyler")
val sss = SortedSet(molly2,tyler2,christina2,aleka2)