// 在集合上创建一个惰性视图, 当使用一个很大的集合时，创建一个惰性的版本
// 除了Stream类，其他集合类的实例都是严格版本的，内存会立即被占用
//一个视图会把结果变为惰性的
val v =  1 to 100
//有视图的会创建一个SeqView的东西
val v2 = (1 to 100).view
//调用force会转变为严格的
val v3 = (1 to 100).view.force
//有一些方法对视图没什么改变
val v4 = (1 to 100).foreach(println)
val v5 = (1 to 100).view.foreach(println)
val v6 = (1 to 100).map{ _ * 2}
val v7 = (1 to 100).view.map {_ * 2}
//此代码会立即返回，等遍历解雇时候再求值
val v8 = (1 to 100).view.map{ e =>{
    Thread.sleep(10)
    e*2
}}
/**
  * view: 会构造一个结果集合的代理，而它的元素只有被使用时才被构造。一个视图
  * 是一种特殊的集合，这种集合代表里一些基本集合。但对于transformers方法是惰性的
  * transformers是一种可以把一个集合构造为一个新的集合的方法，像map,filter,reverse等
  */
  val l = List(1,2,3)
  val l2 = l.view.reverse
  val x = (1 to 1000).view.map{e => 
      Thread.sleep(30)
      e*2
  }
  x.foreach(print)
  /**
    * 使用视图的场景：
    * 1. 性能
    * 2. 把集合当作数据库视图
    */
val arr = (1 to 10).toArray
val view = arr.view.slice(2,5)
arr(2) = 42
view.foreach(println)
//在视图中改变元素值
view(0) = 10
view(1) = 20
view(2) = 30
arr.foreach(println)
/**
  * refs: http://docs.scala-lang.org/overviews/collections/views.html
  */