package week2.monday.afternoontask.mvpsanctuary

import week2.monday.afternoontask.mvpsanctuary.animalspecies.{DragonFly, Owl, Warthog}
import week2.monday.afternoontask.mvpsanctuary.traits.DietType
import week2.monday.afternoontask.mvpsanctuary.utils.AdditionOfAnimals


object Sanctuary extends App {
  val additionOfAnimals = new AdditionOfAnimals();

  val warthog1 = new Warthog("Leo", 6, "Brown", true, true, DietType.Herbivore)
  val dragonFly1 =  new DragonFly("Buzz", 1, 6, DietType.Herbivore)
  val owl1 = new Owl("Silver", 3, 0.2, "White", 23, DietType.Omnivore)

  println(additionOfAnimals.addWarthog(warthog1))
  println(additionOfAnimals.addOwl(owl1))
  println(additionOfAnimals.addDragonFly(dragonFly1))

  // check and animal is endangered or not
  println(warthog1.isAnimalEndangered(warthog1.conservationStatus))





}
