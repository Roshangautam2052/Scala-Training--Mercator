package week6.mvp1.task1B

import week6.mvp1.task1B.OperationLists.{Add, Divide, Multiply, Subtract}
import week6.mvp1.task1B.error.GenericError

object Calculator extends App {
  private val calculatorMethods = new CalculatorMethods()

  case class NumberAndOperation(x: Double, y: Double, operation: OperationLists)

  def calculate(numberAndOperation: NumberAndOperation): (Double, Double) => Either[GenericError, Double] = {
    numberAndOperation.operation match {
      case Add => calculatorMethods.add(numberAndOperation.x, numberAndOperation.y)
      case Subtract => calculatorMethods.subtract(numberAndOperation.x, numberAndOperation.y)
      case Multiply => calculatorMethods.multiply(numberAndOperation.x, numberAndOperation.y)
      case Divide => calculatorMethods.divide(numberAndOperation.x, numberAndOperation.y)
      case _ => calculatorMethods.invalidMethod(numberAndOperation.x, numberAndOperation.y)
    }
  }

  private val firstNumberAndOperation = NumberAndOperation.apply(17, 0, OperationLists.Divide)
  private val getResults = calculate(firstNumberAndOperation)(firstNumberAndOperation.x, firstNumberAndOperation.y)
  println(s"The result of division is $getResults")

  private val secondNumberAndOperation = NumberAndOperation.apply(17, 100, OperationLists.Add)
  private val getResults2 = calculate(firstNumberAndOperation)(firstNumberAndOperation.x, firstNumberAndOperation.y)
  println(s"The result of division is $getResults2")




}
