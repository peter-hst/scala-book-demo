class StarfleetComponent
//一个特质集成一个类，这种做法不常见，用来限制特质混入的使用范围
trait StarfleetWarpCore extends StarfleetComponent
class Starship extends StarfleetComponent with StarfleetWarpCore

//不能通过编译
//class RomulanStuff
//class Warbird extends RomulanStuff with StarfleetWarpCore

//限制只有StoreEmployee地向可以传递食物，所以DeliversFood特质通过集成强制限定
abstract class Employee
class CorporateEmployee extends  Employee
class StoreEmployee extends Employee
trait DeliversFood extends StoreEmployee
//无法通过编译
//class Receptions extends CorporateEmployee with DeliversFood


