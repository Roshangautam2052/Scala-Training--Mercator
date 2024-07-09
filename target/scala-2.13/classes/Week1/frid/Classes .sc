/** Classes
 */

// Capital for the name
// declare using 'class'
// act as blueprints

/*
 First way - unimplemented members
 */

class ThemeParkEmptyParams(val hasRollerCoaster: Boolean, val diameterOfLargestLoop: Double) {

}
// Second way -> implement the members
//{} braces used here
// default parameters

class ThemeParkDefaultParams {
  val hasRollerCoasters: Boolean = true
  val diameterOfLargestLoop: Double = 30.24
}

// Everything inside {} belongs to that class. Known as the members of the class
//                  This is changeable parameter
class ThemeParkBoth(val diameterOfLargestLoop: Double) {
  // default parameters
  val hasRollerCoasters: Boolean = true
}

// Use classes to make objects

val mercatorPark: ThemeParkEmptyParams = new ThemeParkEmptyParams(hasRollerCoaster = true, diameterOfLargestLoop = 7.99)
mercatorPark.getClass
mercatorPark.hasRollerCoaster

// Default Params
val disneyWorld: ThemeParkDefaultParams = new ThemeParkDefaultParams()
disneyWorld.diameterOfLargestLoop

/**
 *
 */
// Give a meaningful name and we can pass raw values or existing vals can be passed in
class Hamster(age: Int, val color: String)

val orange: String = "Orange"
// make the hamster object
val BooTheHamster: Hamster = new Hamster(age = 1, color = orange)

/**
 * Objects without classes
 */
// When we only need 1 of something
// Don't use the new keyword
// have no params
// Available globally

object DavidDogs {
  val Loki: String = "Loki"
  val Tayamul: String = "Tayamul"
  val Bilal: String = "Bilal"
}

DavidDogs.Loki

/**
 * Inheritance
 */

// use extends keyword
// declare the class we want to extend
// class we extend from is called the parent or superclass
// can only extend one class  it doesn't support multiple inheritance just like in java

//class Bakken extends ThemeParkDefaultParams{
//  override val diameterOfLargestLoop: Double = 20.25
//  val oldestThemePark: Boolean = true
//}
class Baken extends ThemeParkEmptyParams(hasRollerCoaster = true, diameterOfLargestLoop = 20.15) {
  val oldestThemePark: Boolean = true
}

/*
 Family tree task
 */

class Person(FirstName: String) {
  val surname: String = "Smith"
}

class Dad extends Person("Steve") {

}

class girlFriend extends Person("Jess") {
  override val surname: String = "Jones"
}


/*
 Traits
 Keyword - with, extend multiple traits
 traits can have unimplemented members
 // we cannot create an instance of a trait(like we can a class )
 use in combination with something else
 */

trait Mascot {
  // unimplemented members
  val nameOfMainCharacter: String

}

trait overSizedFood {
  val hugeTurkeyLeg: Boolean
}

class DisneyWorld extends ThemeParkDefaultParams with Mascot with overSizedFood {
  override val nameOfMainCharacter: String = "Mickey"
  override val hasRollerCoasters: Boolean = false
  override val hugeTurkeyLeg: Boolean = true

}