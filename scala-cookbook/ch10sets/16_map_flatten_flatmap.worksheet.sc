val bag = List("1","2","three","4","one hundred seventy five")

def toInt(in:String):Option[Int] = {
    try{
        Some(Integer.parseInt(in.trim))
    } catch {
        case e: Exception => None
    }
}

val sum = bag.flatMap(toInt).sum
val mmap = bag.map(toInt)
// flatten可以很好地解决包含Some和None元素的列表，它会取出Some中的值，然后忽略掉None元素
val mmap2 = bag.map(toInt).flatten
//使用flatten后求和变得简单（ map之后flat，但方法名叫flatMap）
val mmap3 = bag.map(toInt).flatten.sum

//集合类库的强大算法
bag.flatMap(toInt).filter(_ > 1)
bag.flatMap(toInt).takeWhile(_ < 4)
bag.flatMap(toInt).partition(_ > 3)

def subWords(word:String) = List(word, word.tail, word.take(word.length - 1))
val subWordList = subWords("then")
val words = List("band","start","then")
val subWordsList = words.map(subWords)
val subWorsListFlatten = words.map(subWords).flatten
//通用法则：无论合适想要在map后调用flatten，就用flatMap。最终自然地调过中间步骤
val subWorsFlatMap = words.flatMap(subWords)