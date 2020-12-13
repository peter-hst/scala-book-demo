val x = List(1, 2.0, 33D, 400L)

val x2 = List[Number](1, 2.0, 33D, 400L)
val x3 = List[AnyVal](1, 2.0, 33D, 400L)

trait Animal
trait FurryAnimal extends Animal
case class Dog(name:String) extends Animal
case class Cat(name:String) extends Animal

val x4 = Array(Dog("Fido"), Cat("Felix"))
val x5 = Array[Animal](Dog("Fido"), Cat("Felix"))

class AnimalKingdom{
    // def animals = Array(Dog("Fido"), Cat("FeAnimallix"))
    def animals = Array[Animal](Dog("Fido"), Cat("Felix"))
}