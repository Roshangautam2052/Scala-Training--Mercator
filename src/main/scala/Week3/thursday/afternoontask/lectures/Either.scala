package Week3.thursday.afternoontask.lectures

import java.time.LocalDate
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object Either extends App{
 // left -error
  // right - success

  def  isEven(x: Int) : Either[String, String] =
    (if (x % 2 == 0) Right(s"$x is even") else Left(s"$x is odd"))

  println(isEven(12))
  println(isEven(13))

  // custom error

  class NewError(val errorCode:Int, val errorMessage: String) extends Exception

  case object ISOddError extends NewError(400, "Bad Request in the is odd method:")

  def  isOdd(x: Int) : Either[NewError, String] = {
    Thread.sleep(100)
    if (x % 2 != 0) Right(s"$x is odd")
    else Left(ISOddError)
  }



  def fetchisOddOrError(x:Int): Future[Either[NewError, String]] = Future{
      isOdd(x)
  }
  val result1 = fetchisOddOrError(4)
  println(isOdd(4))
  println(isOdd(7))

  /**
   * Try/Catch
   */
  def plusOne(x:String): Either[String, Int] ={
    try{
      Right(x.toInt)
    }
    catch{
      case e: Exception => Left(s"Failed due to: ${e.getMessage}")
    }
  }
  println(plusOne("1")) // Right -try
  println(plusOne("one")) // Left-catch

  // functions directly
  plusOne("3").map(num => num +1)
  plusOne("I will fail").map(num => num +1)


  // Pattern Matching
  def plusOneMatch(): Unit ={
    plusOne("one") match {
      case Left(e) => println(s"Left: $e") // comes first
      // Make sure always hit the left case first take care of compile time
      case Right(x) => println(s"Right: $x")
    }
  }
  println(plusOneMatch())

  // Most important bit of using  Methods
  /**
   * for comps with eithers
   * // Fail fast --> as soon as one condition is not met = exit
   */
  case class User(userName:String, password:String, dateOfBirth:LocalDate)

  case class ValidatedUser(userName:String, password:String, dateOfBirth:LocalDate)

  //Validate the userName
  def validateUserName(userName:String): Either[String, String] ={
    if(userName.length < 12) Left("Username must be at least 12 Characters")
    else Right(userName)
  }

  //Validate the password
  def validatePassword(password:String): Either[String, String] ={
    if(password.toUpperCase == password || password.toLowerCase== password){
      Left("Password must be a mixture of upper and lower case")
    }
    else Right(password)
  }
  //Validate the age
  def validateAge(dateOfBirth: LocalDate): Either[String, LocalDate] ={
    if(dateOfBirth.plusYears(18).isAfter(LocalDate.now())) Left("User must be 18 years old")
    else Right(dateOfBirth)
  }
  //Combine all 3 and validate the whole user

  def validatedUser(user:User):Either[String, ValidatedUser] ={
    for {
      username <- validateUserName(user.userName)
      // moves on to password after checking username
      // if any of these doesn't pass then it will exit for comprehension and hit the left and we will not get the final case class
      password <- validatePassword(user.password)
      dateOfBirth <- validateAge(user.dateOfBirth)
      createValidatedUser = ValidatedUser(userName = username, password = password, dateOfBirth = dateOfBirth) // creation of case class
    } yield createValidatedUser
  }
  val userNameBad = User("April","passowrD", LocalDate.of(1994,6,7))
  val passwordBad = User("AprilGarlingTON","passowwwerwer", LocalDate.of(1994,6,7))
  val dateOfBirthBad= User("AprilGarlington","passowrD", LocalDate.of(2023,6,7))

  val happyUser= User("AprilGarlington","passowrD", LocalDate.of(1996,6,7))

  println(validatedUser(userNameBad)) //Error
  println(validatedUser(passwordBad)) // Error
  println(validatedUser(dateOfBirthBad)) // Error
  println(validatedUser(happyUser)) // validated User
}
