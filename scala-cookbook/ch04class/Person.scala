class Person(var firstName:String, var lastName:String){
    println("构造器开始...")

    // 成员属性
    private val HOME = System.getProperty("user.name")
    var age = 0

    //一些方法
    override def toString = s"$firstName $lastName is $age years old."
    def printHome { println(s"HOME = $HOME")}
    def printFullName { println(this)} // 调用toString

    printHome
    printFullName
    
    println("此处仍在构造器中....")
}

// 生成getter/setter
class Person2(var name:String)
// 只生成getter
class Person3(val name:String)
// 限制可见性，也不生成getter/setter
class Person4(name:String)
// 不生成getter/setter，只能在类内部成员使用
class Person5(private var name:String){ def getName{println(name)}}
// Case类构造器参数默认是val和普通类有差异
case class Person6(name:String)
object Pizza{
    val DEF_CRUST_SIZE = 12
    val DEF_CRUST_TYPE = "THIN"
    }
class  Pizza(var crustSize:Int, var crustType:String){ // 主构造函数
    def this(crustSize:Int){
        this(crustSize, Pizza.DEF_CRUST_TYPE)
    }
    def this(crustType:String){
        this(Pizza.DEF_CRUST_SIZE)
        this.crustType = Pizza.DEF_CRUST_TYPE
    }
    def this(){
        this(Pizza.DEF_CRUST_SIZE,Pizza.DEF_CRUST_TYPE)
    }
    override def toString = s"A $crustSize inch pizza with a $crustType crust"
}
case class PersonCase(var name:String, var age:Int)
class Socket(val timeout:Int = 10000) // 默认值
// 单例模式
class Brain private{
    override def toString = "This is brain."
}
object Brain {
    val brain = new Brain
    def getInstance
}