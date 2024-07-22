package week4.lectures

import scala.annotation.tailrec

object Recursion extends App {

  //standard recursion

  def factorial (n: Int) : Int = {
    if(n<=1){
      1
    }
    else {
      //println(s"Currently working on ${n-1}")
      val finalResult = n*factorial(n-1)
      //println(s"I'm the final call of $n")
      finalResult
    }
  }
  println("\nFactorial method (4) - standard rec:")
  println(factorial(4))
  //println(factorial(40000000)) // stack overflow error limited memory on call stack

  // Tail Recursion
  // Helps stops the stack overflow error - reusing the call stack

  def smartFactorial(n: Int) : Int = {
    @tailrec
    def factorialHelper(x: Int, acc: Int): Int = { //helper method (has an accumulator + any additional parameters that maybe needed during the recursion, but not in the original method)
      if(x <=1) acc
      else {
        factorialHelper(x-1, x * acc) // holds the running total
      }
    }
    factorialHelper(n, 1)
  }
  println("\nFactorial method (4) - tail rec:")
  println(smartFactorial(4))

  // Tail rec -> concatenate a string n times

  // Without a helper method
  @tailrec
  def concatenateWords(aWord:String, n: Int, acc:String): String= {
    if(n <= 0) acc
    else {
      concatenateWords(aWord, n-1, acc + aWord)
    }
  }

  println("\ntail rec concatenation words ")
  println(concatenateWords("Hello ", 30, "World"))

  // Recursion with Enums
  object DayOfWeek extends Enumeration {
    type dayOfWeek = Value // allows days of week to be used as type
    val Monday, Tuesday, Wednesday, Thursday, Friday, Saturday = Value
  }

  def enumListToString(dayOfWeekEnums: List[DayOfWeek.Value]) :String = {
    @tailrec
    def enumListHelper(dayEnums:List[DayOfWeek.Value], acc:String):String= {// acc has same return type as of return type of main method
      dayEnums match {
        case Nil => acc
        case ::(head, tail) =>
          val makeNiceToRead = if (acc.isEmpty) "" else ","
          enumListHelper(tail, acc+ makeNiceToRead + head.toString)

      }
    }
    enumListHelper(dayOfWeekEnums, "")
  }
  println("\n enum to string method:" + enumListToString(List(DayOfWeek.Monday, DayOfWeek.Tuesday, DayOfWeek.Friday)))


  sealed trait DayOfWeek

  case object Monday extends DayOfWeek
  case object Tuesday extends DayOfWeek
  case object Wednesday extends DayOfWeek
  case object Thursday extends DayOfWeek
  case object Friday extends DayOfWeek
  case object Saturday extends DayOfWeek

 val caseObjectOfDaysOfWeek: List[DayOfWeek] = List(Monday, Tuesday,Wednesday, Thursday, Friday, Saturday)

  def objectsToString(listDays: List[DayOfWeek]) : String = {
    @tailrec
    def helperMethod(remainingListDays: List[DayOfWeek], acc:String): String = {
      remainingListDays match {
        case Nil => acc
        case ::(head, tail) =>
          val makeNiceToRead = if (acc.isEmpty) "" else ","
          helperMethod(tail, acc + makeNiceToRead + head.toString)

      }

    }
    helperMethod(listDays, "")
  }

  println("\ncase object to string:" + objectsToString(caseObjectOfDaysOfWeek))



}
