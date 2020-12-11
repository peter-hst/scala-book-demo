abstract class Animal {
    val greeting = {println("Animal"); "Hello"}
}

class Dog extends Animal {
    override val greeting = { println("Dog"); "Woof"}
}

abstract class Animal2 {
    var greeting = "Hello"
    var age = 0
    override def toString = s"I say $greeting, and I'm $age years old."
}

class Dog2 extends Animal2 {
    greeting = "Woof"
    age = 2
}

trait Animal3 {
    val greeting : Option[String]
    var age: Option[Int] = None
    override def toString = s"I say $greeting, and I'm $age years old."
}

class Dog3 extends Animal3{
    val greeting  = Some("Woof")
    age = Some(2)
}

case class Person(name:String, relation:String)
case class Company(var name:String)

case class Employee(name:String,loc:String,role:String)
//val fred = Employee("Fred","Anchorage","Salesman")
//val joe = fred.copy(name="Joe", role="Manager")

class Person(name:String,age:Int){
    def canEqual(a:Any) = a.isInstanceOf[Person]
    override def equals(that:Any): Boolean = that match {
        case that: Person => that.canEqual(this) && this.hashCode == that.hashCode
        case _ => false
    }
    override def hashCode:Int = {
        val prime = 31
        var result = 1
        result = prime * result + age;
        result = prime * result + (if(name == null) 0 else name.hashCode)
        return result
    }
}

class Employee(name:String, age:Int, var role:String) extends Person(name, age){
    override def canEqual(a:Any) = a.isInstanceOf[Employee]
    override def equals(that:Any):Boolean = that match {
        case that:Employee => that.canEqual(this) && this.hashCode == that.hashCode
        case _ => false
    }
    override def hashCode:Int = {
        val ourHash = if(role == null) 0 else role.hashCode
        supper.hashCode + ourHash
    }
}

class PandorasBox{
    case class Thing(name:String)
    var things = new collection.mutable.ArrayBuffer[Thing]()
    things += Thing("Evil Thing #1")
    things += Thing("Evil Thing #2")
    def addThing(name:String) { things += new Thing(name)}
}

class OuterClass{
    class InnerClass{
        var x = 1
    }
}

object OutterObject {
    class InnerClass{
        var x = 1
    }
}

class OuterClass{
    object InnerObject {
        val y = 2
    }
}