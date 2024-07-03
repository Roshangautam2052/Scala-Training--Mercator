 /*
 1. Make a val called new which is type string.
 Why doesn't this compile?
  */
 //val new : String = " Mercator"
 /*
  This code does not compile as it needs identifier for variable assignment
  Since new is a reserved keyword for creating objects  we cannot use it as an identifier
  */

 // For making our code to work we need to remove the new keyword and then add an identifier

 val `new` : String = "Mercator"

 /*
  There are several other keywords we cannot use a identifier
  which are 'Class', 'Int', 'String', 'var', 'abstract' etc.
  */