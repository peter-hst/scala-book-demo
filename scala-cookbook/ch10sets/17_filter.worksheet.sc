val x = List.range(1,10)
// 过滤谓词为true的元素。filterNot过滤谓词为false的元素
val evens = x.filter(_ % 2 == 0)

/**
  * 过滤集合的主要方法：
  * collect,diff,distinct,drop,dropWhile,filter,filterNot,find,foldLeft,foldRight,
  * head,headOption,init,intersect,last,lastOption,reduceLeft,reduceRight,remove,
  * slice,tail,take,takeWhile,union
  * 
  * filter会遍历集合中所有元素，其他方法的一部分会提前结束
  */

  val fruits = Set("orange","peach","apple","banana")
  val x2 = fruits.filter(_.startsWith("a"))
  val y = fruits.filter(_.length > 5)

  val list = "apple"::"banana"::1::2::Nil
  val strings = list.filter{
      case s:String => true
      case _ => false
  }

  def onlyStrings(a:Any) = a match {
      case s:String => true
      case _ => false
  }

  val strings2 = list.filter(onlyStrings)

  // 多次过滤
  def getFileContentsWithoutBlankCommonts(fileName:String):List[String]={
      io.Source.fromFile(fileName).getLines.toList.filter(_.trim != "").filter(_.charAt(0)!='#')
  }