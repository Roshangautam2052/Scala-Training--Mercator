package week6.mvp.Task1B

class CalculatorMethods extends MethodsForCalculator {

  override def add(x: Double, y: Double): (Double, Double) => Option[Double] = {
    (x:Double, y:Double) => Some(x + y)
  }
  override def subtract(x: Double, y: Double): (Double, Double) => Option[Double] =  {
    (x:Double, y:Double) => Some(x - y)
  }
  override def divide(x: Double, y: Double): (Double, Double) => Option[Double] = {
    y match {
      case divisor if divisor == 0 => (x, y) => None
      case divisor if divisor >= 0 => (x, y) => Some(x/y)
      case _ => (x, y) => Some(x/y)
    }
  }
  override def multiply(x: Double, y: Double): (Double, Double) => Option[Double]={
    (x, y) => Some(x*y)
  }
}
