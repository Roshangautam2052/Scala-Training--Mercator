package Week3.friday.afternoontask.mvp

import Week3.thursday.afternoontask.extension.{GenericPostageError, Letter, Name, PostCode, ValidLetter}
import Week3.thursday.afternoontask.extension.Letter.letterOrError

import java.util.concurrent.TimeUnit
import scala.concurrent.duration.{Duration, FiniteDuration}
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.util.{Failure, Success}


object MVP extends App{
  implicit val ec: ExecutionContext = ExecutionContext.global

  def fetchLetter(): Future[Letter] = Future{
    Thread.sleep(1000)
    Letter(Name.apply("Tayamul123"), PostCode.apply("B70 9PZ"))
  }

 val eventualLetter: Future[Letter] = fetchLetter()

  def checkError:String = eventualLetter.value match{
    case Some(Success(foundLetter)) => s"The future completed with value $foundLetter"
    case Some(Failure(exception)) => s"The future completed with an exception $exception "
    case None => "Future did not completed "
  }
  val waitTime: FiniteDuration = Duration(5,TimeUnit.SECONDS)
  println(Await.ready(eventualLetter,waitTime))
  println(checkError)

}
