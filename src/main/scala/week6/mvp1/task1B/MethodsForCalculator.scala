package week6.mvp1.task1B

import week6.mvp1.task1B.error.GenericError

abstract class MethodsForCalculator {
  def add(x: Double, y: Double): (Double, Double) => Either[GenericError, Double]
  def subtract(x: Double, y: Double): (Double, Double) => Either[GenericError, Double]
  def multiply(x: Double, y: Double): (Double, Double) => Either[GenericError, Double]
  def divide(x: Double, y: Double): (Double, Double) => Either[GenericError, Double]
  def invalidMethod(x:Double, y:Double): (Double, Double) => Either[GenericError, Double]

}
