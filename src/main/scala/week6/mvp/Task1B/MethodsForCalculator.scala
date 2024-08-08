package week6.mvp.Task1B

abstract class MethodsForCalculator {
  def add(x: Double, y: Double): (Double, Double) => Option[Double]
  def subtract(x: Double, y: Double): (Double, Double) => Option[Double]
  def multiply(x: Double, y: Double): (Double, Double) => Option[Double]
  def divide(x: Double, y: Double): (Double, Double) => Option[Double]

}
