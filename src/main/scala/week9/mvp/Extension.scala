package week9.mvp

object Extension extends App {
  abstract class Animal() {
    def name: String
  }

  case class Dog(name: String) extends Animal

  case class Cheetah(name: String) extends Animal

  case class Swan(name: String) extends Animal

  case class Cat(name: String) extends Animal

  abstract class Pack[+A] {
    def addToPack[B >: A](elem: B): NonEmptyPack[B] = {
      NonEmptyPack(elem, this)
    }
  }

  case class NonEmptyPack[A](head: A, tail: Pack[A]) extends Pack[A]

  object EmptyPack extends Pack[Nothing]

  val emptyPack: Pack[Animal] = EmptyPack
  val dogPack = emptyPack.addToPack(Dog("Danny"))
  val animalPack = dogPack.addToPack(Cat("Smoky"))

  abstract class Vet[-A] {
    // def healAnimal(animalToRescue: A) : A creates a compilation error
    def healAnimal(animalForRescue: A) :  Animal
  }

  class GeneralVet extends Vet[Animal] {

    override def healAnimal(animalForRescue: Animal): Animal = {
      println(s"Healing the animal ${animalForRescue.name}")
      animalForRescue
    }
  }
   val vet: Vet[Dog] = new GeneralVet()
   val healDog: Animal = vet.healAnimal(Dog("Rocky"))

}
