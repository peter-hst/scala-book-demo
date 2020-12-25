/**
  * 创建大小可变的数组
  */
 import scala.collection.mutable.ArrayBuffer
 var characters = ArrayBuffer[String]()
 characters += "Ben"
 characters += "Jerry"
 characters += "Dale" 

 val chars = ArrayBuffer("Ben","Jerry")
 chars += "Dale"
 chars ++= Seq("Andy","Big Ed")
 chars.append("Laura","Lucy")
 println(chars)