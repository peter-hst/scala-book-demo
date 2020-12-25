/**
  * List的惰性版本，Stream
  */
// List通过::构造，Stream用#::构建，表达式结尾用那Stream.empty代替Nil
val stream = 1 #:: 2 #:: 3 #:: Stream.empty
// warning: method toStream in trait IterableOnceOps is deprecated (since 2.13.0): Use .to(LazyList) instead of .toStream
val stream2 = (1 to 100000000).toStream
//val stream3 = (1 to 100000000).to(LazyList)
//尝试返回头和尾的元素会立即返回,这些是惰性的，需要的时候再计算
val h = stream2.head
val t = stream2.tail
val t3 = stream2.take(3)
val t4 = stream2.filter(_ < 200)
val t5 = stream2.filter(_ > 200)
val t6 = stream2.map { _ * 2 }
//以下非变换方法注意容易引发OOM错误
stream.max
stream.size
stream.sum
/**
  * Stream refs: http://docs.scala-lang.org/overviews/collections/concrete-immutable-collection-classes.html
  */