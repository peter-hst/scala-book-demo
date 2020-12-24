//遍历一个序列的所有元素，同时比较两个相邻的元素
//reduceLeft,foldLeft,reduceRight,foldRight
val a = Array(12,6,15,2,20,9)
val sum = a.reduceLeft(_ + _)
val sum2 = a.reduceLeft((x,y) => x + y)
val prod = a.reduceLeft(_ * _)
val min = a.reduceLeft(_ min _)
val max = a.reduceLeft(_ max _)
//显示过程中的步骤
val findMax = (x:Int, y:Int) => {
    val winner = x max y
    println(s"compared $x to $y, $winner was larger")
    winner
}

val max2 = a.reduceLeft(findMax)
val peeps = Vector("al","hannah","emily","christina","aleka")
val maxLength = peeps.reduceLeft((x,y) => if(x.length > y.length) x else y)
val minLength = peeps.reduceLeft((x,y) => if(x.length < y.length) x else y)

//求和
val a1 = Array(1.0,2.0,3.0)
val s1 = a1.reduceLeft(_ + _)
//foldLeft支持2个参数，第一个是种子参数
val s2 = a1.foldLeft(20.0)(_ + _)
val s3 = a1.foldLeft(100.0)(_ + _)
// reduceLeft和reduceRight大多数算法中没有区别，reduce是遍历顺序是不确定的
val divide = (x:Double,y:Double) => {
    val result = x / y
    println(s"divided $x by $y to yield $result")
    result
}

val d1 = a1.reduceLeft(divide)
val d2 = a1.reduceRight(divide)
val d3 = a1.reduce(divide)
//scanLeft和scanRight两个方法遍历序列的方式与reduceLeft和reduceRight类似，只是他们返回一个序列而非一个单值
val product = (x:Int,y:Int) => {
    val result = x * y
    println(s"multiplied $x by $y to yield $result")
    result
}

val arr = Array(1,2,3)
val r1 = arr.scanLeft(10)(product)
// reduceLeftOption/reduceRightOption

val findMax2 = (x:Int,y:Int) => {
    Thread.sleep(10)
    val winner = x max y
    println(s"compared $x to $y, $winner was larger")
    winner
}
val arr3 = Array.range(0, 50)
val r3 = arr3.par.reduce(findMax2)