// 强大之处：可以很容易更换算法。这跟棉线对象的策略设计模式更换算法原理一样
def exec(callback:Int => Unit) { callback(1) }
val plusOne = (i:Int) => {println(i+1)}
val plusTen = (i:Int) => {println(i + 10)}
val rs = exec(plusOne)
val rs2 = exec(plusTen)

// 除了函数入参以外的其他参数
val sayHello = () => println("Hello")
def executeXTimes(callback:() => Unit, numTimes:Int) {
    for(i <- 1 to numTimes) callback()
}
executeXTimes(sayHello,3)
// 该方法不关心具体算法实现
def executeAndPrint(f:(Int,Int) => Int, x:Int,y:Int) {
    val result = f(x,y)
    println(result)
}
val sum = (x:Int, y:Int) => x + y
val multiply = (x:Int,y:Int) => x * y
executeAndPrint(sum, 2, 9)
executeAndPrint(multiply, 3, 9)

def exec(callback:(Any,Any) => Unit, x:Any, y:Any){ callback(x, y)}
def printTwoThings = (a:Any,b:Any) => {
    println(a)
    println(b)
}
case class Person(name:String)
exec(printTwoThings,"Hello", Person("Dave"))