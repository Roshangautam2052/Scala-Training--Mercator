package Week3.thursday.afternoontask.extension

import Week3.thursday.afternoontask.extension.Name.nameOrError
import Week3.thursday.afternoontask.extension.PostCode.postCodeError
import Week3.thursday.afternoontask.mvp.QualifiedBuyer

import scala.runtime.Nothing$

case class Letter(name:Name, postCode: PostCode){

  def apply(name:Name): Either[GenericPostageError, Letter] ={
    if(name.value.length>12) Left[InvalidNameError, Nothing]
   else Right[Nothing, Letter]
 }
}

object Letter{
 def letterOrError(maybeName:String, mayBePostCode:String): Either[GenericPostageError, ValidLetter]={
      for{
        name <- nameOrError(maybeName)
       postCode<-postCodeError(mayBePostCode)
      }
        yield ValidLetter(name, postCode)
  }
}
