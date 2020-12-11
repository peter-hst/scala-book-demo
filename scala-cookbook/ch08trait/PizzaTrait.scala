// 特质字段可以声明为var或val，子类/特质中重写var不需要override关键字
// 重写val时是必需的
trait PizzaTrait {
    var numToppings: Int  //抽象
    var size = 14 // 混入
    val maxNumToppings = 10 //concrete
}

class Pizza extends PizzaTrait {
    var numToppings: Int = 0 // 'override'不是必须的
    size = 16   // 'var'和'override'不是必须的
    override val maxNumToppings: Int = 10 // 'override' 是必须的
}