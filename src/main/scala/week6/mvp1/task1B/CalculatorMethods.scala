package week6.mvp1.task1B

import week6.mvp1.task1B.error.{DivisionByZeroNotAllowedError, GenericError, MethodNotFoundError}

class CalculatorMethods extends MethodsForCalculator {

  override def add(x: Double, y: Double): (Double, Double) => Either[GenericError, Double] = {
    (x:Double, y:Double) => Right(x+y)
  }
  override def subtract(x: Double, y: Double): (Double, Double) => Either[GenericError, Double] =  {
    (x:Double, y:Double) => Right(x+y)
  }
  override def divide(x: Double, y: Double): (Double, Double) => Either[GenericError, Double] = {
    y match {
      case divisor if divisor == 0 => (x, y) => Left(DivisionByZeroNotAllowedError("Division by Zero is not possible"))
      case divisor if divisor >= 0 => (x, y) => Right(x/y)

    }
  }
  override def multiply(x: Double, y: Double): (Double, Double) => Either[GenericError, Double]={
    (x, y) => Right(x*y)
  }

  override def invalidMethod(x:Double, y:Double): (Double, Double) => Either[GenericError, Double] = {
    (x, y) => Left(MethodNotFoundError("Cannot find the method"))
  }
}
