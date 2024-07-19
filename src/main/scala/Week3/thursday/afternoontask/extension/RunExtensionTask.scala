//package Week3.thursday.afternoontask.extension
//
//object RunExtensionTask extends App {
//
//  // This is a valid letter
//  val letter: Either[GenericPostageError, Letter] = Right(Letter(Name("Michael"),PostCode("DE13 8ES")) )
//  // create a invalid letter
//
//  val invalidLetter:Either[GenericPostageError, Letter]= Left(InvalidNameError("Name is not valid "))
//  println(letter)
//  println(invalidLetter)
//
//  val letter1: Right[Nothing, Letter] = Right(Letter(Name("Michael"),PostCode("DE13 8ES")))
//  val invalidLetter2: Left[InvalidNameError, Nothing] = Left(InvalidNameError("The name is not valid"))
//
//  println(letter1)
//  println(invalidLetter2)
//
//  // maybePostCode
//  val postCode = PostCode
//  println(postCode.postCodeError("B70 8BS"))
//
//  // nameOrError
//  val name = Name
//  println(name.nameOrError(Name("test")))
//
//
//
//}
