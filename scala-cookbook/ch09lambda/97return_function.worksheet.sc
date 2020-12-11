// 等号左边是一个方法的定义，右侧是一个函数字面量(匿名函数)
def saySomething(prefix:String) = (s:String) => {
    prefix + " " + s
}
val sayHello = saySomething("Hello")
sayHello("Al")

// 第二个例子
// 在函数内封装一个算法，指定不同语言，返回对应的问候方式，这很像工厂模式或策略模式
def greeting(language:String) = (name:String) => {
    language match {
        case "english" => "Hello, " + name
        case "spanish" => "Buenos dias, " + name
    }
}
val hello = greeting("english")
val buenosDias = greeting("spanish")
hello("Al")
buenosDias("Lorenzo")