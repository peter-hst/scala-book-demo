class Foo {
  var a: Short = 0 //指定默认值
  var b: Short = _ //默认是0
  // 推荐使用Option/Some/None模式,让null从代码里消失,如Play框架这种模式常见
  var name = null.asInstanceOf[String]

  def ~=(x:Double, y:Double, precision: Double) = if((x - y).abs < precision) true else false

  import java.util.{Currency, Locale}
  val de = Currency.getInstance(new Locale("de","DE"))
  fmt.setCurrency(de)
  println(fmt.format(123456.789))
}
