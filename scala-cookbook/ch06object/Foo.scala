class Foo {
    private val secret = 2
    //访问私有对象字段obj
    def printObj {println(s"I can see ${Foo.obj}")}
}

object Foo{
    private val obj = "Foo's object"
    // 访问自由类字段
    def double(foo:Foo) = foo.secret * 2
}

object Driver extends App {
    val f = new Foo
    println(Foo.double(f))
    f.printObj
}