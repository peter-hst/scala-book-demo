// 定义职位可能输入值的子集工作的函数
val divide = (x:Int) => 42 / x
// divide(0) // 抛出异常

// 定义偏函数，显式声明函数只有在入参非0是才被定义
val divide2 = new PartialFunction[Int,Int] {
    def apply(x: Int) = 42 / x
    def isDefinedAt(x: Int): Boolean = x != 0
}

divide2.isDefinedAt(1)
if (divide2.isDefinedAt(1)) divide2(1)
divide2.isDefinedAt(0)

// 经常会用case语句实现
val divide3: PartialFunction[Int,Int] = {
    case d:Int if d != 0 => 42 / d
}

divide3.isDefinedAt(1)
divide3.isDefinedAt(0)
// Scaladoc对PartialFunction的描述：
// 一个PartialFunction[A,B]类型的偏函数是一元函数，其域并不需要包括类型A的所有值。
// isDefinedAt函数允许你动态地测试值是否在函数的有效域中
// PartialFunction特质的签名 trait PartialFunction[-A,+B] extends (A) => B
// (A) => B 解释为一个函数将类型A转换南城类型B的结果
// PartialFunction[Int, String] 输入Int值返回一个String

val convertLowNumToString = new PartialFunction[Int, String] {
    val nums = Array("one", "two", "three", "four", "five")
    def apply(i: Int): String = nums(i-1)
    def isDefinedAt(i: Int): Boolean = i > 0 && i < 6
}

convertLowNumToString.isDefinedAt(3)
convertLowNumToString.isDefinedAt(7)

// orElse和andThen偏函数很棒的特性可以将一些函数连在一起，

// 每个函数只能处理5个数字，但是用orElse将他们结合后，就可以处理10个数字
val convert1to5 = new PartialFunction[Int,String]{
    val nums = Array("one", "two", "three", "four", "five")
    def apply(i: Int): String = nums(i-1)
    def isDefinedAt(i: Int): Boolean = i > 0 && i < 6
}

val convert6to10 = new PartialFunction[Int,String]{
    val nums = Array("six", "seven", "eight", "nine", "ten")
    def apply(i: Int): String = nums(i-6)
    def isDefinedAt(i: Int): Boolean = i > 5 && i < 11
}
val handle1to10 = convert1to5 orElse convert6to10
handle1to10(3)
handle1to10(8) 
// map方法中使用该函数将会导致MatchError
//List(0,1,2) map {divide3}