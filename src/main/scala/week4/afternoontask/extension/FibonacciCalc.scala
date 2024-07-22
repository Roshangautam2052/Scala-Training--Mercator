package week4.afternoontask.extension

import scala.annotation.tailrec

object FibonacciCalc extends App{

  def calculateFibonacciNumber(n: Int): Int ={
    @tailrec
    def helpCalculateFibonacciNumber(number:Int,previousNumber:Int, nextNumber:Int):Int = {
      if(number>=n) previousNumber
      else {
        helpCalculateFibonacciNumber(number+1, previousNumber+ nextNumber, previousNumber)
      }
    }
    if(n <= 0) 0
    else if (n> 0 && n<=2) 1
    else
    helpCalculateFibonacciNumber(2,1,1)
  }

  println(calculateFibonacciNumber(-3))

}
