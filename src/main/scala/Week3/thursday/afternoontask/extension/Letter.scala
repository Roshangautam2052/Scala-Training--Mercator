package Week3.thursday.afternoontask.extension

import Week3.thursday.afternoontask.extension.Name.nameOrError
import Week3.thursday.afternoontask.extension.PostCode.postCodeError

case class Letter(name: Name, postCode: PostCode) {

}

object Letter {
  def letterOrError(maybeName: String, mayBePostCode: String): Either[GenericPostageError, ValidLetter] = {
    for {
      name <- nameOrError(maybeName)
      postCode <- postCodeError(mayBePostCode)
    }
    yield ValidLetter(name, postCode)
  }
}
