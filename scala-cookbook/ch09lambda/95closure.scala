import scala.collection.mutable.ArrayBuffer
package otherscope {
    class Foo {
        def exec(f:String => Unit, name:String){
            f(name)
        }
    }
}
// 闭包工作原理
// sayHello方法有两个自由变量，name是形参;hello不是形参，是封闭范围内对一个变量的引用
object ClosureExample extends App {
    var hello = "Hello"
    def sayHello(name:String) {println(s"$hello, $name")}
    val foo = new otherscope.Foo
    foo.exec(sayHello ,"Al")
    hello = "Hola"
    foo.exec(sayHello,"Lorenzo")
    //第二个例子
    var votingAge = 18
    val isOfVotingAge = (age:Int) => age >= votingAge
    isOfVotingAge(votingAge) //false
    isOfVotingAge(20) // true
    def printResult(f:Int => Boolean, x:Int) {println(f(x))}
    printResult(isOfVotingAge, 20) // true
    votingAge = 21 // 改变值后，字段和函数依然纠缠在一起
    printResult(isOfVotingAge,20) // false
    //第三个例子
    val fruits = ArrayBuffer("apple")
    val addToBasket = (s:String) => { //引用 fruits 变量
        fruits += s
        println(fruits.mkString(","))
    }
    def buyStuff(f:String => Unit, s:String){
        f(s)
    }
    buyStuff(addToBasket,"cherries")
    buyStuff(addToBasket, "grapes")
}