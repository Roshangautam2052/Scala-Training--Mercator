// Finite sets of data

/**
 * Native
 */

object Weekday extends Enumeration{
  val Monday, Tuesday, Wednesday , Thursday, Friday, Saturday = Value

}
// convert this to string
Weekday.Thursday.toString
// Useful for acronyms/ long names
object ReOrderWeekDay extends Enumeration {
  val Monday = Value(1)
  val Tuesday = Value(2)
  val Thursday = Value(3)
  val Friday = Value(4)
  val Saturday = Value(5)
}
  ReOrderWeekDay.values
  ReOrderWeekDay.Monday

def exhaustiveMatch(reOrderWeekDay: ReOrderWeekDay.Value): String ={
  reOrderWeekDay match {
    case ReOrderWeekDay.Monday => "Monday"
    case ReOrderWeekDay.Tuesday => "Tuesday"
    case ReOrderWeekDay.Thursday => "Thursday"
    case ReOrderWeekDay.Friday => "Friday"
    case ReOrderWeekDay.Saturday => "Saturday"
  }
}
println(exhaustiveMatch(ReOrderWeekDay.Monday))

// Be careful about non exhaustive matching always match exhaustive matching for enums
def nonExhaustiveMatch(reOrderWeekDay: ReOrderWeekDay.Value): String ={
  reOrderWeekDay match {
    case ReOrderWeekDay.Monday => "Monday"
    case ReOrderWeekDay.Tuesday => "Tuesday"

  }
}

/**
 * Sealed case objects
 * They are more often
 */

sealed trait Weekday
case object Monday extends Weekday
case object Tuesday extends Weekday
case object Wednesday extends Weekday
case object Thursday extends Weekday
case object Friday extends Weekday
case object Saturday extends Weekday

def caseObjectMatch(weekday1: Weekday): String ={
  weekday1 match {
    case Monday => "Ya its Monday"
    case Tuesday => "Tuesday"
    case Wednesday => "Wednesday"
    case Thursday => "Thursday"
    case Friday => "Friday"
    //case Saturday => "Saturday"
  }
  abstract class Error(name:String, errorCode: Int)
  case object WeekDayNotFoundError extends Error("WeekDay not Found", 404)

}
