trait Pet{
    def speak {println("Yo")} //默认实现，混入
    def comeToMaster // 抽象
}

class Dog extends Pet {
    // 不修改trait实现就无需重写 speak
    def comeToMaster: Unit = { println("I'm coming!")}
}

class Cat extends Pet {
    override def speak: Unit = {println("meow")}
    def comeToMaster: Unit = {println("That's not gonnna happen.")}
}
//一个类只能集成一个抽象类，但却可以集成多个特质，因此特质更灵活
abstract class FlyingPet extends Pet {
    def fly{ println("I'm flying!")}
}