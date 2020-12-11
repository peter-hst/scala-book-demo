object NewtonsMethod{
    def main(args: Array[String]): Unit = {
        driver
    }

    /**
      * A "driver" function to test Newton's method
      * Start with (a) the desired f(x) and f'(x) equations,
      * (b) an initial guess and (c) tolerance values.
      */
    def driver {
        // the f(x) and f'(x) functions
        val fx = (x:Double) => 3*x + math.sin(x) - math.pow(math.E, x)
        val fxPrime = (x:Double) => 3 + math.cos(x) - math.pow(Math.E, x)
        val initialGuess = 0.0
        val tolerance = 0.00005
        // 
        val answer = newtonsMethod(fx, fxPrime, initialGuess, tolerance)
        println(answer)
    }

    /**
      * Newton's Methos for solving equations
      * @todo check that |f(xNext)| is greater than a second tolerance value
      * @param fx
      * @param fxPrime
      * @param x
      * @param tolerance
      * @return
      */
    def newtonsMethod(fx:Double => Double, fxPrime: Double => Double, x:Double, tolerance:Double):Double = {
        var x1 = x1
        var xNext = newtonsMethodHelper(fx, fxPrime, x1)
        while(math.abs(xNext - x1) > tolerance){
            x1 = xNext
            println(xNext)
            xNext = newtonsMethodHelper(fx, fxPrime, x1)
        }
        xNext
    }

    /**
      * this is the "x2 = x1 - f(x1)/f'(x1)" calculation
      *
      * @param fx
      * @param fxPrime
      * @param x
      * @return
      */
    def newtonsMethodHelper(fx:Double => Double, fxPrime:Double => Double, x:Double) = {
        x - fx(x) / fxPrime(x)
    }
}