/**
  * scala.io.Source
  */
import scala.io.Source
val filename = "/etc/passwd"
for(line <- Source.fromFile(filename).getLines) {
    println(line)
}

val lines = Source.fromFile("/etc/fstab").getLines.toList
val lines2 = Source.fromFile("/etc/fstab").getLines.toArray
//这种方式有副作用，只要JVM在运行，文件就处于打开状态
val fileContents = Source.fromFile("/etc/hosts")

val bufferedSource = Source.fromFile("/etc/passwd")
for(line <- bufferedSource.getLines){
    println(line.toUpperCase)
}
//关闭释放资源文件，“贷款模式(Loan Pattern)”
bufferedSource.close

// sudo lsof -u peter | grep '/etc/passwd' 检查passwd文件是否处于打开状态

// 自动关闭资源
// 当与文件或其他需要被正确关闭的资源打交道时，最好考虑使用贷款模式，这个模式确保资源在跳出作用范围之外时被关闭
// 可通过 try/finally语句来实现

/* 模板
def using[A](r:Resource)(f:Resource => A):A = {
    try {
        f(r)
    }finally {
        r.dispose()
    }
}
*/