package week6.extensionandresearch.task3

object CreateExponents extends App{
  val exponentCalculator = new ExponentCalculator

  def squareFunction(base:Int) : Int ={
    exponentCalculator.power(2)(base).toInt
  }
  val calculateSquare = squareFunction(6)
  println(calculateSquare)

}
