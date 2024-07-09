/**
 * With parenthesis ()
 */

// construct with no defined constructor parameters
class park1
//Make object
new park1

// Construct with defined parameters
// This does not mean we are not giving default parameters
// We do not have to put val/var(best practise)
// best practise is to put val

class Park2( val rollerCoaster:Boolean, val largestLoop:Double)
// Make a new object , best practise is to put namedArguments
val x = new Park2(rollerCoaster = true, largestLoop = 4.5)
x.rollerCoaster
x.rollerCoaster
new Park2(rollerCoaster = true, largestLoop = 2.5)

// Extend Park2 class - must enter values because i don't have default
object Disney extends Park2(rollerCoaster = true, largestLoop = 4.67)

class Disney extends Park2(rollerCoaster = true, largestLoop = 82937)

// Abstract -if we are not giving default values but are giving defined parameters we might want to
// make it abstract - safety net

abstract class Park3(val coaster:Boolean, val loop: Double)
// We cannot make an object of an abstract class

// Abstract class must be extended in order to use them

// Constructing with default parameters
// Unlikely to change
class Park4(val coaster:Boolean= true, val loop: Double = 4.7)
// Make an object
new Park4 // would use default values
// we do not use to use the keyword override or val/var
// Can override none, 1, multiple
// if not overriding, do not include it
new Park4(coaster = false)//using for the loop but has a override for coaster

/** With curly braces
 *
 */
//No defined parameter
class Park5{

}
// Make object
new Park5

// Constructed with defined parameters(but not default)-- NOPE cannot do that
// Make it abstract OR give defaults
// class Park6({
//  val coaster: Boolean
//  val loop: Double
//}

//abstract class Park6{
//  val coaster: Boolean
//  val loop: Double
//}

// Construct with default parameters
// New Line
// Must say val/ var, we must make the blue print immutable
class Park7{
  val coaster: Boolean = true
  val loop: Double = 5.6
}
// Make object
new Park7
// By overriding
val y = new Park7{
  override val loop: Double = 12
  override val coaster: Boolean = false
}

y.coaster
y.loop

// We can extend
// create an object LegoLand and extending Park7
object LegoLand extends Park7
LegoLand.loop
LegoLand.coaster

// Override // Only use override keyword for curly braces
object LegoLand2 extends Park7 {
  override val coaster: Boolean = false
  override val loop: Double = 34.5
}

/**
 * Abstract Classes
 */

/**
 * {}
 */
// must use val/ var
// every single time I make an object, every time I create an object I have to include
// coaster and loop
abstract class Park8{
  var coaster: Boolean
  val loop: Double
}
// make object
new Park8{
  override var coaster: Boolean = true
  override val loop: Double = 6.32
}
// when extending - must give a value to every parameter(even if it has a default-- safety)
object HydePark extends Park8 {
  override var coaster: Boolean = false
  override val loop: Double = 0.0
}

/**
 * ()
 */
abstract class Park9( val coaster: Boolean, val loop: Boolean)
// We cannot make an object
//new Park9(coaster= false, loop = 5.7)

// Extend the class we can make an object
// it is much safer to keep the arguments
object AnotherNewPark extends Park9(coaster = false, loop = false)

// What is accessible?
// Will loose access to parameters if you remove val/ var from abstract class with ()
AnotherNewPark.coaster
AnotherNewPark.loop

/**
 * () and {}
 */

class Park10 (val coaster: Boolean){
  val loop: Double = 7.6
}

new Park10(coaster = true){
  override val loop: Double = 12
}