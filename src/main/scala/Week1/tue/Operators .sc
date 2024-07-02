// Arithmetic operators

// + (a+b)
//  -(a-b)
// / (a/b)
// * (a*b)
// % - modulus(a%b) -- finds the remainder


val a : Int = 10
val b : Int = 5
val c : Int = 3

val add = a+b
val subtract = a-b
val divide = a/b
val multiply = a * b
val modulus = a % b

// Relational Operators
/*
 == Equality
 != Inequality
 < Less than
 <= Less than or equal to
 > Greater than
 >= Greater than equal to
 */

val equality = a == a
val inequality = a!= b
val lessThan = a < b
val greaterThan = a >b
val lessThanOrEqualTo = a <= b
val greaterThanOrEqualTo = a>=b

// Logical Operators
/*
 Combines Boolean

 */

val and = true && false // both needs to be true to return true
val or = true || true // only one needs to be true to return true
val not = !true