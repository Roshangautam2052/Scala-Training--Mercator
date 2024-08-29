package week9.mvp

object Task1 extends App {

  abstract class Animal() {
    def name: String

    def food: FoodType
  }

  case class Dog(name: String, food: FoodType) extends Animal

  case class Cheetah(name: String, food: FoodType) extends Animal

  case class Swan(name: String, food: FoodType) extends Animal

  case class Cat(name: String, food: FoodType) extends Animal


  def printAnimal(animal: Animal): Unit = {
    println("The animal name is " + animal.name)
    println("The animal is a: " + animal.food.foodType)
  }

  val petAnimal: Animal = Dog("Jack", Omnivore("Omnivore"))
  val wildAnimal: Animal = Cheetah("Shera", Carnivore("Omnivore"))

  printAnimal(petAnimal)
  printAnimal(wildAnimal)

  // Task2
  class Solitary[T](val animal: T)

  val solitaryCat: Solitary[Cat] = new Solitary[Cat](Cat("Lucy", Omnivore("Omnivore")))
  // val solitaryAnimal: Solitary[Animal] = solitaryCat // This does not compile

  // Task3
  class Pair[+A](val first: A, val second: A)

  val swanPair: Pair[Swan] = new Pair[Swan](Swan("Swan1", Carnivore("Carnivore")), Swan("Swan2", Carnivore("Carnivore")))
  val animalPair: Pair[Animal] = swanPair

  // Task4
  abstract class Feeder[-A] {
    def feedAnimal(animal: A): Unit =
      println("Feeding an Animal")
  }

  val animalFeeder: Feeder[Animal] = new Feeder[Animal] {
    override def feedAnimal(animal: Animal): Unit =
      println(s"Feeding the ${animal.name} with the ${animal.food.foodType} food")
  }

  val dogFeeder: Feeder[Dog] = animalFeeder
  dogFeeder.feedAnimal(Dog(name = "Lucy", food = Herbivore("Herbivore")))

  // dogFeeder.feedAnimal(Cat(name= "pandu", food = Carnivore("Carnivore")))
  /** * This won't compile because the dogFeeder is of type Dog and if we change that into of type Cat it will compile */

}
