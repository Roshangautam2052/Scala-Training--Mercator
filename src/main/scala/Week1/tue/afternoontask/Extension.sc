//Extension
  //1.
  "STRING" == "string"
/*
 STRING == string is false because, == operator compares the character to character unicode value of
 each strings since the unicode value of  character 'S' is greater than unicode value of character 's'
 they are not equal
 */

//2. Can you convert "one" to 1 ?
// Yes we can convert "one" to 1 using PartialFunction method
val numberToDigitConversion: PartialFunction[String, Int] = {
  case "one" => 1
}
numberToDigitConversion.lift("one").foreach(println)
//3. Can you convert 1 to "one"?
// Yes we can convert "one" to 1 using PartialFunction method
 val digitToNumberConversion: PartialFunction[Int, String] ={
   case 1 => "one"
 }
 digitToNumberConversion.lift(1).foreach(println)

/*
 Can you convert 1 to a string? Is the result as you would expect?
  -->Yes, we can covert 1 which is integer to a string in scala using the method toString
 */
val conversion1: Int = 1
val intToStringConversion = conversion1.toString

//5. Convert a lowercase string to uppercase
val lowerCase: String = "hello world"
val upperCase: String = lowerCase.toUpperCase()
println("The uppercase conversion of "+ lowerCase +" is " + upperCase)

//6. Convert the first letter of a string to uppercase.
val firstStringConversion: String = lowerCase.capitalize
println("The Capitalized word is " + firstStringConversion)