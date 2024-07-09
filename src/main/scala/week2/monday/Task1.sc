// Task1
def getBigVal(num1: Int, num2: Int): String = {
  if (num1 > num2) "first"
  else if (num1 < num2) "second"
  else if(num1== num2) "same"
  else "Error "
}

val result1:String = getBigVal(12,13)
val result1:String = getBigVal(14,13)

// Task2
def nameLength(firstName:String, surname:String):Int = {
  val firstNameLength = firstName.length
  val secondNameLength = surname.length
  if(firstNameLength> secondNameLength) firstNameLength
  else if(firstNameLength<secondNameLength) secondNameLength
  else if(firstNameLength == secondNameLength) 0
  else 404
}

val nameLengthDiff: Int = nameLength("Chris", "Pratt")
val nameLengthDiff: Int = nameLength("Tom", "Hiddleston")
val nameLengthDiff: Int = nameLength("", "Pratt")
