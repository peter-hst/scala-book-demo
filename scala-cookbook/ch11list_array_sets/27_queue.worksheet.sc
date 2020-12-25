/**
  * 使用队列
  */
  class Person(var name:String)
  import scala.collection.mutable.Queue
  var ints = Queue[Int]()
  var fruits = Queue[String]()
  var q = Queue[Person]()
  val q2 = Queue(1,2,3)
  var q3 = new Queue[String]
  q3 += ("kiwi","banana")
  q3 ++= List("cherry","count")
  q3.enqueue("pineapple")
  println(q3)
  val next = q3.dequeue
  println(q3)
  val dequ = q3.dequeueAll(_.length > 6)
  val dequeueFirst = q3.dequeueFirst(_.startsWith("b"))
  println(q3)

  /**
    * refs: 可变Queue类 http://www.scala-lang.org/api/current/index.html#scala.collection.mutable.Queue
    * 不可变queue类: http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.Queue
    */