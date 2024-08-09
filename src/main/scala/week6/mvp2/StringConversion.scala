package week6.mvp2

class StringConversion {

  def convertToUpperCase(value:String): (String) => String = {
    (value) => value.toUpperCase()
  }

  def convertToLowerCase(value:String): String => String = {
    (value) => value.toLowerCase()
  }

}
