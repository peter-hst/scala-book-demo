// 伴生对象
class Pizza(var crustType:String) {
    override def toString = "Crust type is " + crustType
}

object Pizza {
    val CRUST_TYPE_THIN = "thin"
    val CRUST_TYPE_THICK = "thick"
    def getFoo = "Foo"
}