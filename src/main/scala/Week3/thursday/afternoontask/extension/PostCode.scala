package Week3.thursday.afternoontask.extension

case class PostCode(value:String) {

}


object PostCode {
  def postCodeError(mayBePostCode:String):Either[InvalidPostCodeError, PostCode] ={
    val postCode = mayBePostCode.split(" ")
    if(postCode.length ==2 && postCode.forall(_.nonEmpty)){
      Right(PostCode(mayBePostCode))
    }
    else Left(InvalidPostCodeError("Sorry the postCode is not valid!!"))

  }

}
