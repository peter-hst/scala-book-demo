import java.io.File
val x = Vector(1,2,3)
x.foreach((i:Int) => println(i))
x.foreach(i => println(i))
x.foreach(println(_))
x.foreach(println)

def printIt(c:Char){ println(c)}
"HAL".foreach(c => printIt(c))
"HAL".foreach(printIt)

val longWords = new StringBuffer
"hello world it's Al".split(" ").foreach{ e =>
 if(e.length > 4) longWords.append(s" $e")
 else println("Not added:" + e)
}

val m = Map("fname" -> "Tyler", "lname" -> "LeDude")
m foreach( x => println(s"${x._1} -> ${x._2}"))
m.foreach{
    case(k,v) => println(s"key: $k, value: $v")
}

val fruits = Traversable("apple","banana","orange")
for(f <- fruits) println(f)
for(f <- fruits) println(f.toUpperCase)
for(f <- fruits){
    val s = f.toUpperCase
    println(s)
}
val fruits2 = Array("apple","banana","orange")
for(i <- 0 until fruits.size) println(s"element $i is ${fruits2(i)}")

// zipWithIndex by view
for((elem, count) <- fruits2.view.zipWithIndex){ println(s"element $count is $elem")}

// 在zip中使用Stream是另一种生成计数器的方法
for((elem,count) <- fruits2.zip(Stream from 1)){
    println(s"element $count is $elem")
}


// warning: value Stream in package scala is deprecated (since 2.13.0): Use LazyList instead of Stream
for((elem,count) <- fruits2.zip(LazyList from 1)){
    println(s"element $count is $elem")
}

// for/yield 多行算法 放在yield后面
val newArray = for(fruit <- fruits2) yield {
    val upper = fruit.toUpperCase
    upper
}

def upperReverse(s:String) = {
    s.toUpperCase.reverse
}

val newArray2 = for(fruit <- fruits) yield upperReverse(fruit)
val names = Map("fname" -> "Ed","laname" -> "Chigliak")
// <- 符号读作 in, 以下读作 for i in 1 to 3, do...
for(i <- 1 to 3) println(i)
for((k,v) <- names) println(s"key: $k, value: $v")
val files = Array(new File("a.txt"),new File("b.txt"),new File("c.txt"))
for{
    file <- files
    if file.isFile
    if file.getName.endsWith(".txt")
} println(file.getName)