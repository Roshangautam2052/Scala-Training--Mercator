package week4.afternoontask.mvp

import scala.annotation.tailrec

object Task4 extends App{

  val numberOfChoice: Int = 5500
  @tailrec
  def sumOFNumbersToGivenChoice(n: Int, acc: Int):Int ={
    if (n<=0) acc
    else{
     sumOFNumbersToGivenChoice(n-1, acc+n)
    }
  }

  println(s"The sum of number for range $numberOfChoice :" +sumOFNumbersToGivenChoice(numberOfChoice, 0))

}
