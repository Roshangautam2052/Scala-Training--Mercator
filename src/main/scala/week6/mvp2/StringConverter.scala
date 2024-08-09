package week6.mvp2

object StringConverter extends App{
  private val stringConverter = new StringConversion()

  def convertString(testString: String, convert:MakeStringUpperCase):(String) => String = {
    if (convert.value) {
      stringConverter.convertToUpperCase(testString)
    } else {
      stringConverter.convertToLowerCase(testString)
    }
  }

  val makeStringUpperCase = MakeStringUpperCase(true)
  val testString = "cOnVeRtMe"

  val getConvertedString = convertString(testString, makeStringUpperCase)
  val getResultForConvertedString = getConvertedString(testString)
  println(getResultForConvertedString)

}
