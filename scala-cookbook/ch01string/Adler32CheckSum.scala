
package tests

/**
  * Calculate the Adler-32 checksum using Scala.
  * @see http://en.wikipedia.org/wiki/Adler-32
  */
object Adler32CheckSum {
    val MOD_ADLER = 65521
  def main(args: Array[String]): Unit = {
      "hello".getBytes.foreach(println)
  }

  def adler32sum(s: String):Int {
      var a = 1
      var b = 0
      s.getBytes.foreach{ char =>         
        a = (char + a) % MOD_ADLER
        b = (b + a) % MOD_ADLER
      }
      b * 65536 + a  // or (b << 16) + a 
  }
}
