val x = List.range(1,10)
// 函数字面量/匿名函数  (i:Int) => i % 2 == 0
// => 理解为一个转换器，它使用右边的算法，将左侧的输入数据转换微新的输出数据
val evens = x.filter((i:Int) => i % 2 == 0)
// 简化的匿名函数：
val evenList = x.filter( _ % 2 == 0)
//简化步骤：
// 1. 格式较长，形式最为清晰
val evens1 = x.filter((i:Int) => i % 2 == 0)
// 2. Scala编译器可以从表达式推断出i是一个Int型
val evens2 = x.filter( i => i % 2 == 0)
// 3. 当参数在函数中只出现一次时，允许使用 _ 通配符替换变量
val evens3 = x.filter(_ % 2 == 0)
x.foreach(println(_))
// 4. 最后函数字面量只有一条语句且只接受一个参数时，参数不需要显式声明
x.foreach(println)