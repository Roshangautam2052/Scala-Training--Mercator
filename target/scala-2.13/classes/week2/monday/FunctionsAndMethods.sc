/**
 * Functions and Methods
 */

// Functions can be assigned to a val , they are also methods
// They are no different to any other types
// don't have to nae them(however if we don't they aren't reusable)

// Methods
// Keyword def is used belongs to a class
// can be overridden and must be named

// Anonymous function
(number: Int) => number +1

// Named function
val addition = (number: Int) => number +1

// Method(also a function)

def addition: Int => Int = (number:Int) =>  number +1

// Override function
def addition: Int => Int = (number:Int) =>  number +10


// Example method

def makeACupOfTea(numberOfSugars: Int): String = {
  val cuppa: String = "tea"
  s"You have made a tea with $numberOfSugars spoons of sugar.Enjoy"

}

// calling the method

makeACupOfTea(8)

val aValue = (2<3)

//val aDifferent value = {
//  if(aValue) 564 else 865
//  42
//}

// VAT method
// we want to make it outside the method because we want to change it
// this val is in the same scope which is class or package so it can be accessed
// method should belong to a class
val vat: Double = 1.2
def priceWithVAT(price: Double ):Double = {
  price*vat
}

priceWithVAT(5.0)

// Method within a class

abstract class Number(num:Int){
  val otherNumber: Int
  def addition(aDifferentNum: Int): Int= {
    num + aDifferentNum
  }
}

//val number = new Number(10);
//val classAddition  = number.addition(12)

// Pure Function
val sentence: String = ""
def append(sentence:String, word:String): String = {
  sentence + "" + word.trim
}
val a = append(sentence, "Allo") // “Allo”
val b = append(sentence, "Allo") // “Allo”

// Impure function
// Pure Function
var sentence: String = ""
def append(word:String): String = {
  sentence = sentence+ " " + word
  sentence.trim
}
val a = append("Allo") // “Allo”
val b = append("Allo") // “Allo”

// always aim for pure function