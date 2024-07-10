// create a case class dog
case class Dog (val name:String, val breed:String , val age:Int)

// create 4 dog objects
val firstDog: Dog = Dog.apply(name = "Jack", breed = "German Shepherd", age = 12)
val secondDog: Dog = Dog.apply(name = "Max", breed = "Labrador Retriever", age = 10)
val thirdDog: Dog = Dog.apply(name = "Charlie", breed = "Poodle", age = 5)
val fourthDog: Dog = Dog.apply(name = "Bella", breed = "Golden Retriever", age = 8)

case class Kennel (val name:String, val dogList: List[Dog])

val firstKennel: Kennel = Kennel.apply("Brum's Kennel", List(firstDog, secondDog, thirdDog, fourthDog))
// change the name of Kennel
val secondKennel: Kennel = firstKennel.copy("Lovely Kennel")

// Create Bird and Cat case classes
case class Cat(val name:String, val breed:String, val favouriteToy: String, val temperament:String)
case class Bird (val name:String, val breed:String, val flightSpeed:Double, val migratory:Boolean )

// Update Kennel class
case class Kennel2(
                    val name:String,
                    val dogList: List[Dog],
                    val catList: List[Cat],
                    val birdList:List[Bird]
                  )
// Create object of Cat, Bird and Dog class
val newCat: Cat = Cat.apply(name = "Whisker", breed = "Siamese", favouriteToy = "Feather Wand", temperament = "Playful")
val newBird: Bird = Bird.apply(name = "Tweety", breed = "Robin", flightSpeed = 20, migratory = true)
val newDog:  Dog = Dog.apply(name = "Max", breed = "Tibetan Mastif", age = 3)

// Add Cat, Bird and Dog objects to Kennel2
val wolvsKennel: Kennel2 = Kennel2.apply(name = "Wolvs Kennel", dogList = List(newDog), catList = List(newCat), birdList= List(newBird))

println(wolvsKennel.toString)