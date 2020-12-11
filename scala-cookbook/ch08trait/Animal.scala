abstract class Animal{
    def speak
}

trait WaggingTail {
    def startTail { println("tail started")}
    def stopTail { println("tail stoped")}
}
trait FourLeggedAnimal {
    def walk
    def run
}
// 这些特质被混入 Mixin
class Dog extends Animal with WaggingTail with FourLeggedAnimal{
    def speak { println("Dog says 'woof'")}
    def walk { println("Dog is walking")} 
    def run { println("Dog is running")}
}