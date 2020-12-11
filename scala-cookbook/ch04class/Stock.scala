class Stock{
    private var price:Double = _
    def setPrice(p:Double) {price = p}
    def isHigher(that:Stock):Boolean = this.price > that.price
}

class Stock{
    private[this] var price:Double = _
    def setPrice(p:Double) {price = p}
    def isHigher(that:Stock):Boolean = this.price > that.price
}

class Foo {
    val text = {
        println("begin....")
        var lines = ""
        try{
            lines = io.Source.fromFile("/etc/passwd").getLines.mkString
        }catch{
            case e: Exception => lines = "Error happend"
        }
        lines
    }
    println(text)
}

object Test extends App{
    val f = new Foo
}

class Foo2{
    import scala.xml.XML
    val xml = XML.load("http://example.com/foo.xml")
}

case class Address(city:String,state:String,zip:String)
case class Person(var username:String, var pwd:String){
    var age = 0
    var firstName = ""
    var lastName = ""
    var address = None:Option[Address]
}

class Person(var name:String, var address:Address){
    override def toString = if (address == null) name else s"$name @ $address"
}

class Employee(name:String,address:Address,var age:Int) extends Person(name,address)