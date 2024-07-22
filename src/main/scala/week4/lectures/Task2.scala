package week4.lectures

import scala.annotation.tailrec

object Task2 extends App {

  sealed trait fruit

  case object Apple extends fruit

  case object Banana extends fruit

  case object Mango extends fruit

  case object PineApple extends fruit

  case object Orange extends fruit

  case object Kiwi extends fruit

  case object Grapes extends fruit

  val listOfFruits: List[fruit] = List(Apple, Banana, Apple, PineApple, Mango, Orange, Orange, Kiwi, Grapes, Kiwi,
    Orange, PineApple, Banana, Orange, Kiwi, Apple, Mango)

  def countNumberOfFruits(listOfFruits: List[fruit], fruitName: fruit): Int = {
    @tailrec
    def helpCountNumberOfFruits(listOfFruits: List[fruit], acc: Int): Int = {
      listOfFruits match {
        case Nil => acc
        case ::(head, tail) =>
          if (head.equals(fruitName)) {
            helpCountNumberOfFruits(tail, acc + 1)
          }
          else {
            helpCountNumberOfFruits(tail, acc)
          }
      }
    }

    helpCountNumberOfFruits(listOfFruits, 0)
  }

  val searchFruit: fruit = listOfFruits(1)
  println(s"The count of $searchFruit  in the list  is: " + countNumberOfFruits(listOfFruits, searchFruit))

}
