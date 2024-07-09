/**
 * Case classes
 */
// Extra methods
// -an apply method
// unapply method
// hash code and equals method
// copy method
// toString method

case class SuperHero(realName:String, heroName:String,weakness:String)

// apply method
// use to make objects
val nepaleseSuperHero: SuperHero = new SuperHero(realName = "Kulman", heroName = "Shaktiman", weakness = "money")
val newSuperHero: SuperHero = SuperHero.apply("Clark Kent", "SuperMan", "kryptonite")
// OR write it out
// Don't need to use the keyword 'new'
val anotherNewSuperHero:SuperHero = SuperHero("Clark Kent", "SuperMan", "kryptonite")
// comparing with anotherNewSuperHero
newSuperHero == anotherNewSuperHero

// Copy method is used to change  update one part without making another part available

val updatedParameters = anotherNewSuperHero.copy(realName = "Thomas Shelby", "Bat Man")
updatedParameters

// A case object is like an object, but for more powerful due to the built in methods
// They are used when we need an immutable singleton objects

/**
 * CASE OBJECTS
 */
case object Hulk

case object SuperMan
Hulk.getClass