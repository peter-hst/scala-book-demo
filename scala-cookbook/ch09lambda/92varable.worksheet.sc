// double是个实例，这跟String和Int没任何区别，函数的实例，也被称为函数值
val double = (i:Int) => {i * 2}
val four = double(2)
val six = double(3)
val list = List.range(1,5)
val doubleList = list.map(double)

// Scala编译器推断返回值为Boolean
val f = (i:Int) => {i % 2 == 0}
val f1: Int => Boolean = i => {i % 2 == 0}
val f2: Int => Boolean = i => i % 2 == 0
val f3: Int => Boolean = _ % 2 == 0

val add = (x:Int,y:Int) => { x + y }
val add1 = (x:Int,y:Int) => x + y
val add2:(Int,Int) => Int = (x,y) => { x + y}
val add3:(Int,Int) => Int = (x,y) => x + y

// modMethod是类方法，modFunction是赋给变量的函数，编码层面不同
def modMethod(i:Int) = i % 2 == 0
def modMethod1(i:Int) = { i % 2 == 0 }
def modMethod2(i:Int):Boolean = i % 2 == 0
def modMethod3(i:Int):Boolean = { i % 2 == 0 }
// Function1特质定义了接受一个参数的函数，modFunction实际上是它的一个实例，函数值是一个对象
val modFunction = (i:Int) => i % 2 == 0
val list2 = List.range(1,10)
val evenList = list2.filter(modMethod)
val evenList2 = list2.filter(modFunction)

//已存在的函数/方法赋给函数变量
// 这种称作部分应用函数(partially applied function),cos方法学窅传入参数，但暂时还没提供
val c = scala.math.cos _
val c1 = scala.math.cos(_)
val v1 = c(0)
val p = scala.math.pow(_,_)
val v3 = p(scala.math.E,2)