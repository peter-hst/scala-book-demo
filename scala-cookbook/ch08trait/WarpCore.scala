// 只允许特质混入到一些有给定签名方法的类型（类，抽象类或特质）中
trait WarpCore {
  this: {
      def ejectWarpCore(pwd:String): Boolean
      def startWarpCore: Unit
    } =>
}

class Starship
//被称作结构化类型
class Enterprise extends Starship with WarpCore{
    def ejectWarpCore(pwd:String):Boolean = {
        if(pwd == "password") {
            println("ejecting core")
            true
        } else {
            false
        }
    }
    def startWarpCore{println("core started")}
}

//给对象实力中添加特质
class DavidBanner
trait Angry{println("You won't like me...")}
object Tests extends App{
    val hulk = new DavidBanner with Angry
}
