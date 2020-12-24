/**
  * 创建使用枚举
  */
package hst.peter.app{
    object Margin extends Enumeration{
        type Margin = Value
        val TOP,BOTTOM,LEFT,RIGHT = Value
    }
}

object Main extends App{
    import hst.peter.app.Margin._

    //usr an enumeration value in a test

    var currentMargin = TOP
    if(currentMargin == TOP) println("working on top")
    import hst.peter.app.Margin
    //遍历枚举
    Margin.values foreach println
}
// 枚举对于常见常量组，如星期，年中的周数，还有许多其他的，如有一组相关联的常量值的情况
// 另一种创建枚举的方式
package hst.peter.app{
    trait Margin
    case object TOP extends Margin
    case object RIGHT extends Margin
    case object BOTTOM extends Margin
    case object LEFT extends Margin
}