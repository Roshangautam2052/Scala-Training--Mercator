package week2.monday.afternoontask.mvpsanctuary.animalsubclass

import week2.monday.afternoontask.mvpsanctuary.kingdom.Animal


abstract class Bird(
                     name: String,
                     age: Int,
                     val beakLength: Double,
                     val featherColour: String) extends Animal(name, age) {
}
