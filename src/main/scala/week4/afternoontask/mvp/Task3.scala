package week4.afternoontask.mvp

object Task3 extends App {
  val n: Int = 20
  val numberList: List[Int] = List.range(1, n + 1)
  def isEven(numberList: List[Int], givenIndex: Int): Either[String, Boolean] = {
    if(numberList(givenIndex)%2 == 0) Right(true)
    else {
      Left("The number at given index is not even")
    }

    }
    println(isEven(numberList, 2))



  }


