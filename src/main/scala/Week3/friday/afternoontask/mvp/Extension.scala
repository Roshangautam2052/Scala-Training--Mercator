package Week3.friday.afternoontask.mvp

import Week3.friday.afternoontask.mvp.MVP.eventualLetter
import Week3.thursday.afternoontask.extension.Letter.letterOrError
import Week3.thursday.afternoontask.extension.{GenericPostageError, Name, PostCode, ValidLetter}

import java.util.concurrent.TimeUnit
import scala.concurrent.duration.{Duration, FiniteDuration}
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.util.Success

object Extension extends App {
  implicit val ec: ExecutionContext = ExecutionContext.global

  def fetchLetterOrError(name: Name, postCode: PostCode):
  Future[Either[GenericPostageError, ValidLetter]] = Future {
    //Thread.sleep(1000)
    letterOrError(name.value, postCode.value)
  }
  // completed valid letter
  //val eventualLetterOrError = fetchLetterOrError(Name.apply("Tiger"), PostCode.apply("B70 9PZ"))

  //Invalid Name error
  //val eventualLetterOrError = fetchLetterOrError(Name.apply("Tiger123"), PostCode.apply("B70 9PZ"))

  // Invalid postCode Error
  val eventualLetterOrError = fetchLetterOrError(Name.apply("Tiger123"), PostCode.apply("B709PZ"))

  def checkErrorInLetter: String = eventualLetterOrError.value match {
    case Some(Success(Left(foundLetter))) => s"The future completed with the letter ${Left(foundLetter)}"
    case Some(Success(exception)) => s" The future completed with an exception ${exception}"
    case None => "The future did not completed"
  }

  val waitTime: FiniteDuration = Duration(5,TimeUnit.SECONDS)
  println(Await.ready(eventualLetterOrError,waitTime))
  println(checkErrorInLetter)

}
