package week2.monday.afternoontask.mvpsanctuary.animalsubclass

import week2.monday.afternoontask.mvpsanctuary.kingdom.Animal


abstract class Insect(
                       name: String,
                       age: Int,
                       val numbOfLimbs: Int
                     ) extends Animal(name, age) {


}
