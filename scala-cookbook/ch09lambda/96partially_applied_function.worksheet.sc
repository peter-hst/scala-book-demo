val sum = (a:Int,b:Int,c:Int) => a + b + c
// f是部分应用函数（偏函数），因为第三个参数没有值
// 1和2被传入原来的sum函数，然后创建里新函数f(偏函数),过了一段时间，数字3被传入f
// 在函数式编程里，当调用含参数的函数时，实际上将行数应用于那些参数。
// 当所有的参数都被传入函数时，就像java一样，函数应用里所有的参数
// 偏函数是可以用来到处传递的变量(称为函数值)之后当提供了函数值需要的所有参数是，最初的函数执行，产生结果
val f = sum(1,2,_:Int)
f(3)

def wrap(prefix:String, html:String,suffix:String) = {
    prefix + html + suffix
}
val wrapWithDiv = wrap("<div>", _:String, "</div>")
wrapWithDiv("<p>Hello, world</p>")
wrapWithDiv("<img src=\"/images/foo.png\" />")
wrap("<pre>","val x = 1","</pre>")