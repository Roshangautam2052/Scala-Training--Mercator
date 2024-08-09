package week6.mvp1

object Task1A extends App {

  def takeInput(number: Int): Int  ={
    number * 2
  }
  def applyTwice(value:Int,function:(Int) => Int):Int = {
      function(function(value))
  }

  println(applyTwice(12, takeInput))

}
