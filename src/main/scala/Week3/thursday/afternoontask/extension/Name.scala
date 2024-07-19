package Week3.thursday.afternoontask.extension

case class Name(value:String){

}

object Name {
  def nameOrError(mayBeName:String): Either[InvalidNameError, Name] ={
    if (mayBeName.exists(_.isDigit)) Left(InvalidNameError("The name is not valid"))
    else Right(Name(mayBeName))
  }
}