class Animal(var name:String)
class Dog(name:String) extends Animal(name)

//

class Animal(var name:String, var age:Int) {
    def this(name: String) {
        this(name,0)
    }
}

class Cat(name:String) extends Animal(name,2){
    println("Cat constructor called")
}

class Dog(name:String) extends Animal(name){
    println("Dog constructor called")
}

case class Address(city:String, state:String)
case class Role(role:String)
class Person(var name:String, var address:Address){
    def this(name:String){
        this(name,null)
        address = null
    }
    override def toString = if(address == null) name else s"$name @ $address"
}

class Employee(name:String, role:Role, address:Address) extends Person(name,address){
    def this(name:String){
        this(name, null, null)
    }
    def this(name:String,role:Role){
        this(name, role, null)
    }
    def this(name:String, address:Address){
        this(name, null, address)
    }
}

abstract class BaseController(db:Database){
    def save {db.save}
    def update {db.update}
    def delete {db.delete}
    // 抽象
    def connect
    // 抽象 返回参数是String
    def getStatus:String
    // 抽象 声明String类型形参
    def setServerName(serverName:String)
}

abstract class Pet(name:String) {
    val greeting:String
    var age:Int
    def sayHello { println(greeting) }
    override def toString = s"I say $greeting, and I'm $age"
}

class Dog(name:String) extends Pet(name){
    val greeting = "Woof"
    var age = 2
}
class Cat(name:String) extends Pet(name){
    val greeting = "Meow"
    var age = 5
}


abstract class Animal{
    val greeting = "Hello"  // 提供初始值
    def sayHello { println(greeting)}
    def run
}

class Dog extends Animal{
    override val greeting = "Woof" // 重写值
    def run {println("Dog is running")}
}

abstract class Animal {
    val greeting = {println("Animal"); "Hello"}
}

class Dog extends Animal {
    override val greeting = { println("Dog"); "Woof"}
}