def executeFunction(callback:()=>Unit) { callback() }
val sayHello = () => {println("Hello")}
executeFunction(sayHello)

//定义函数作为方法入参的常用语法格式 paramName:(paramType(s)) => returnType
// 本例paramName是f，paramType为空，因为函数不接受任何参数，returnType为Unit
def executeFunction2(f:() => Unit) { f() }
// def executeFunction3(f:String => Int)