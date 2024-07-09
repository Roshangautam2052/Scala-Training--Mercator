package week2.monday.afternoontask.mvpsanctuary.animalsubclass

import week2.monday.afternoontask.mvpsanctuary.kingdom.Animal


abstract class Mammal(
                       name: String,
                       age: Int,
                       val furColour: String,
                       val hasTail: Boolean
                     ) extends Animal(name, age) {

}
