/*
  1. Automatic Methods: The case class have inbuilt methods like `toString`, `equals`, `hasCode`
  which makes it useful for pattern matching and collections
  The normal class doesn't have any inbuilt methods inside them.

  Immutability: All parameters in case class are by default val which makes the instances immutable,
  where as the parameter in normal classes are either val or var gives the flexibility to create mutable objects.

  PatternMatching: Case classes are specially useful for pattern matching whereas normal classes do not support pattern matching
  out of the box.
  There is no copy method in normal classes to change few attributes of a class whereas there is a copy method
  which we can use to change few attributes of a class.

 */

// 2. This will not throw an error
case class Person (name:String, age:Int, nationality:String, isStudent:Boolean)

val firstPerson = Person(name = "Carlos", age = 23, nationality = "Spanish", isStudent = false)
val secondPerson = Person(name = "Carlos", age = 23, nationality = "Spanish", isStudent = true)
val thirdPerson = Person(name = "Chole", age = 25, nationality = "British", isStudent = false)

class Animal (name : String, colour:String, pet:Boolean)
// val cat = Animal("cat", "black", true) This throws error as new keyword is not used to initialize the object
val dog = new Animal("dog", "white", true)

//3.
case class Muffin(flavour:String, price:Double, storeBoughtFrom:String)

val chocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")
val blueberryMuffin = Muffin("blueberry", 3.50, "Mercator Bakery")
val vanillaMuffin = Muffin("vanilla ", 3.50, "Mercator Bakery")
val anotherChocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")
val oneMoreChocolateMuffin = Muffin("Chocolate", 3.50, "Mercator Bakery")
val oneMoreChocolateMuffin = Muffin("choocolate", 2.50, "MercatorBakery")
/*
 Using the == operator
 anotherChocolateMuffin, chocolateMuffin are equal
 */
anotherChocolateMuffin == chocolateMuffin