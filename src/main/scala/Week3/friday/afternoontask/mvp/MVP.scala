package Week3.friday.afternoontask.mvp

import scala.concurrent.{ExecutionContext, Future}


object MVP extends App{
  implicit val ec: ExecutionContext = ExecutionContext.global

  def fetchLetter(): Future[Letter] ={

  }

}
