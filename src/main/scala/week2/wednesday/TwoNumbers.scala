package week2.wednesday

class TwoNumbers(x:Int, y:Int) {

  def add(): Int = {
    x + y
  } // empty implementation make the naming as explict as possbile
  def subtractYFromX(): Int = {
    x - y
  }
  def multiply() : Int = {
    x * y
  }
  def divideXFromY(): Int = {
    x / y
  }
  def xIsAMultipleOfY() : Boolean = {
    x % y == 0
  }
}
