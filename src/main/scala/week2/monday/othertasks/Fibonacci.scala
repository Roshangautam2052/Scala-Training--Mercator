package week2.monday.othertasks

import scala.annotation.tailrec

object Fibonacci extends App{

  def generateFibonacciNumber(n:Int):Int ={
    @tailrec
    def fiboTailrec(i:Int, last:Int, nextLast: Int): Int ={
      if(i>=n) last
      else fiboTailrec(i+1, last+nextLast,last)

    }
    if(n<=2) 1
    else fiboTailrec(3,1,1)
  }

  println(generateFibonacciNumber(3))

}
