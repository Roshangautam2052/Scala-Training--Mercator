package week6.extensionandresearch.task1

object ListMaximumCalculator extends App{
  val maximumCalculator = new MaximumCalculator
  def maxListNum(numberList:List[Double],func:(Double, Double) => Double): Double = {
    numberList.reduce((x,y) => func(x, y))
  }

  val doubleNumberList:List[Double] = List(1.2, 100.4, 2.1, 8.0, 90.1, 25.32)
  println(maxListNum(doubleNumberList, maximumCalculator.max))


}
