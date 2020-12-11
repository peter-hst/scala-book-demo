trait Animal{
    def speak
}

object Animal {
    private class Dog extends Animal {
        override def speak {
            println("woof")
        }
    }
    private class Cat extends Animal {
        override def speak {
            println("meow")
        }
    }

    def apply(s:String):Animal = s match {
        case "dog" => new Dog
        case _ => new Cat
    }
}