package week6.mvp.Task1B

import week6.mvp.Task1B.OperationLists.{Add, Divide, Multiply, Subtract}

object Calculator extends App{
  val calculatorMethods = new CalculatorMethods()
  case class NumberAndOperation(x:Double, y:Double, operation:OperationLists)

  def calculate(numberAndOperation:NumberAndOperation):(Double, Double) => Option[Double] = {
    numberAndOperation.operation match {
      case Add => calculatorMethods.add(numberAndOperation.x, numberAndOperation.y)
      case Subtract => calculatorMethods.subtract(numberAndOperation.x, numberAndOperation.y)
      case Multiply=> calculatorMethods.multiply(numberAndOperation.x, numberAndOperation.y)
      case Divide => calculatorMethods.divide(numberAndOperation.x, numberAndOperation.y)
    }
  }
  val firstNumberAndOperation = NumberAndOperation.apply(17, 125, OperationLists.Divide)
  val getResults = calculate(firstNumberAndOperation)(firstNumberAndOperation.x, firstNumberAndOperation.y)
  println(getResults)

}
