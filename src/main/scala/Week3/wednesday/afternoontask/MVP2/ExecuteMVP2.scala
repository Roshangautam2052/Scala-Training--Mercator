package Week3.wednesday.afternoontask.MVP2

import java.time.LocalDate
import java.time.format.{DateTimeFormatter, DateTimeParseException}
import scala.io.StdIn.readLine

object ExecuteMVP2 extends App{
  val occupation: OccupationEnum = OccupationEnum()
  val ageCalculatorAndStarSignFinder:AgeCalculatorAndStarSignFinder = new AgeCalculatorAndStarSignFinder()
  //val birthDate = new LocalDate
  val dateFormat: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
  //val userName:String = readLine("Enter your name:")
  val userInput:String = readLine("Enter your date of birth in (yyyy-mm-dd): ")
  try {
    val birthDate:LocalDate = LocalDate.parse(userInput, dateFormat)
    println(ageCalculatorAndStarSignFinder.ageCalculator(birthDate))
    println(ageCalculatorAndStarSignFinder.startSignFinder(birthDate))

  }
  catch{
    case e: DateTimeParseException => e.getMessage
  }




}
