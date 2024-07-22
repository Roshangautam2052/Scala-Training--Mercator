package week4.lectures

import scala.annotation.tailrec

object Task1 extends App{
  var counter: Int = 0
//  def standardRecursion(listOfString: List[String], counter:Int): Int ={
//    if(listOfString(counter).isEmpty && counter>=listOfString.length-1)counter
//    else standardRecursion(listOfString, counter+1)
//  }
//  println(standardRecursion(List("a", "b", "c" ), counter))
  // Task A
  def numOfElements(list:List[String]): Int = {
    if(list.isEmpty) 0
    else 1+ numOfElements(list.tail)
  }

  println(s" number of elements: " + numOfElements(List("a", "b", "c")))

  // Task B
  @tailrec
  def smartNumOfElements(list:List[String], acc: Int): Int = {
    if (list.isEmpty) acc
    else  smartNumOfElements(list.tail, acc+ 1)
  }

  println(s" number of elements with tail recursion is:" + smartNumOfElements(List("a", "b", "c"), 0))


  // Tail Recursion with Match case
  @tailrec
   def caseMatchForFindingNumberOfElements(list: List[String], acc: Int):Int = list match {
    case Nil => acc
    case ::(head, tail) => caseMatchForFindingNumberOfElements(list, acc+1)

  }

  println(s" number of elements with tail recursion with case match:" + caseMatchForFindingNumberOfElements(List("a", "b", "c", "d"), 0))


  def numOfElementMatch(list: List[String]):Int = list match {
    case Nil => 0
    case :: (head, tail) =>
      println(s"current head:$head")
      println(s"current tail:$tail")
      1 + numOfElementMatch(tail)
  }
  println(s" number of elements with tail recursion with case match:" + numOfElementMatch(List("a", "b", "c", "d")))



}
