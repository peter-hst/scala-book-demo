implicit class StringToInt(s:String) {
  //不需要在方法上 定义抛出异常声明,以下定时是合法的,Scala没有受检异常
  @throws(classOf[NumberFormatException]) //Java调用者使用时,异常捕获是必须的
  def toInt(radix: Int):Option[Int] = {
      try {
          Some(Integer.parseInt(s,radix))
      }catch {
          case e:NumberFormatException => None
      }
  }
}