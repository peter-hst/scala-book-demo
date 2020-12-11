class Foo {
    private[this] def isFoo = true

    def doFoo(other:Foo) {
        // 无法编译，other.isFoo不可访问
       // if(other.isFoo) println("1") else println("0")
    }
}

class Animal{
    private def heartBeat{}
}

class Dog extends Animal{
    // 无法编译方法是私有的
    //heartBeat
}

class AnimalProt{
    protected def breathe {}
}

class Dog extends AnimalProt{
    breathe
}

class Jungle{
    val a = new Animal
    a.breathe
}

package com.acme.coolapp.model {
    class Foo {
        private[model] def doX {} //model包范围可见
        private def doY {}
    }

    class Bar{
        val f = new Foo
        f.doX
        // 不能编译
        //f.doY
    }
}

package com.acme.coolapp.model2 {
    class Foo {
        private[model2] def doX {} //model包范围可见
        private[coolapp] def doY {}
        private[acme] def doZ {}
    }

    class Bar{
        val f = new Foo
        f.doX
        // 不能编译
        //f.doY
    }
}

import com.acme.coolapp.model2._

package com.acme.coolapp.view{
    class Bar{
        val f = new Foo
        //f.doX //不能编译
        f.doY
        f.doZ
    }
}

package com.acme.common {
    class Bar {
        val f = new Foo
        // f.foX //不能编译
        // f.doY //不能编译
        f.doZ
    }
}

class FourLeggedAnimal{
    def walk { println("I'm walking")}
    def run { println("I'm running")}
}

class Dog extends FourLeggedAnimal{
    def walkThenRun {
        super.walk
        super.run
    }
}

trait Human{
    def hello = "The Human trait"
}

trait Mother extends Human {
    override def hello = "Mother"
}

trait Father extends Human {
    override def hello = "Father"
}

class Child extends Human with Mother with Father {
    def printSuper = super.hello
    def printMother = super[Mother].hello
    def printFather = super[Father].hello
    def printHuman = super[Human].hello
}

trait Animal {
    def walk {println("Animal is walking")}
}
class FourthLeggedAnimal extends Animal {
    override def walk { println("I'm walking on all fours")}
}

class Dog extends FourLeggedAnimal{
    def walkThenRun{
        super.walk
        super[FourLeggedAnimal].walk
        super[Animal].walk //无法编译
    }
}

class Connection {
    def makeConnection(timeout:Int = 5000, protocol:String = "http") {
        println("timeout = %d, protocol = %s".format(timeout, protocol))
    }
}

class Pizza {
    var crustSize = 12
    var crustType = "Thin"
    def update(crustSize:Int, crustType:String) = {
        "A %d inch %s crust pizza.".format(crustSize, crustType)
    }
}

class Person{
    protected var fname = ""
    protected var lname = ""
    def setFirstName(firstName:String):this.type = {
        fname = firstName
        this
    }

    def setLastName(lastName:String): this.type = {
        lname = lastName
        this
    }
}