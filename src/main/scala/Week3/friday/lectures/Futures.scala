package Week3.friday.lectures

// global is a lazy val --> which is not executed until it is called
import java.util.concurrent.TimeUnit
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.{Duration, FiniteDuration}
import scala.concurrent.{Await, Future}

object Futures extends App{
// They act as a placeholder

  def addition(x:Int, y:Int) :Int ={
    Thread.sleep(1000) // long computation time
    x + y
  }
  def additionInFuture: Future[Int] = Future {
    addition(100, 200)
  }

  val waitTime: FiniteDuration = Duration(5,TimeUnit.SECONDS)
  println(Await.result(additionInFuture, waitTime))
}
