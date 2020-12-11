// 更推荐的trait限制解决办法 this:BaseType => declaration
class Starship
trait MyTrait {
  this: Starship => //使用this来限制
  // more code here....
}
trait StarfleetWarpCore{
    this: Starship =>   
}
class RomulanShip
class Enterprise extends Starship with StarfleetWarpCore
//不能编译通过
// self-type:任何具有类混入特质的时候，必须保证它的类型和特质的自身类型相一致
// class Warbird extends RomulanShip with StarfleetWarpCore

// 一个特质也可以要求使用它的具体类继承多个其他类型，如下：
trait WrapCore {
    this: Starship with WarpCoreEjector with FireExtinguisher =>
}
trait WarpCoreEjector
trait FireExtinguisher
// 可通过编译
class Enterprise2 extends Starship
    with WrapCore
    with WarpCoreEjector
    with FireExtinguisher
// 不能编译，自身类型签名不正确    
//class Enterprise3 extends Starship with WrapCore with WarpCoreEjector 
