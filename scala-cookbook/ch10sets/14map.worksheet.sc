val helpers = Vector("adam", "kim", "melissa");
// the long form
val caps = helpers.map(e => e.capitalize)
// the shirt form
val caps2 = helpers.map(_.capitalize)
val names = Array("Fred","Joe","Jonathan")
val lengths = names.map(_.length)
val nieces = List("Aleka","Christina","Molly")
//把集合直接编程XML元素列表
val elems = nieces.map(niece => <li>{niece}</li>)
val ul = <ul>{nieces.map(i => <li>{i}</li>)}</ul>

def plusOne(c:Char):Char = (c.toByte + 1).toChar
"HAL".map(plusOne)

val s = " eggs, milk, butter, Coco Puffs"
val items = s.split(",").map(_.trim)

val people = List("adam", "kim", "melissa")
val caps1 = people.map(_.capitalize)
val caps2 = for(f <- people) yield f.capitalize
val fruits = List("apple","banana","lime","orange","raspberry")
// 一旦map里添加里if 结果部分元素可能为()
val newFruits = fruits.map(f => if(f.length < 6) f.toUpperCase)
//过滤掉()的元素
val newFruits2 = newFruits.filter(_ != ())

val fruits = List("apple","banana","lime","orange","raspberry")
fruits.filter(_.length < 6).map(_.toUpperCase)