
trait Numbers {
  val one = 1
  val two = 2
  val three = 3

  def addOneAndThree(): Int = {
    one + three
  }

  def addNumAndTwo(num: Int):
  Int = {
    num + two
  }

  def divideFromOne(num: Int): Int = {
    num / 1
  }
}

object Subtractions extends Numbers {
  def subtractNumFromFour(num: Int) = {
    addOneAndThree - num + one

  }

  def divideNumbers(num: Int): Int = {
    divideFromOne(num)
  }
}

object Multiplications  {
  val three = 4

  def multiplyNumAndThree(num: Int) = {
    num * Subtractions.divideNumbers(num)
  }

  def multiplyTwoAndThree = {
     Subtractions.addOneAndThree()
  }

}


Multiplications.multiplyNumAndThree(4)
Subtractions.divideFromOne(100)
Multiplications.multiplyNumAndThree(500)
Multiplications.multiplyTwoAndThree