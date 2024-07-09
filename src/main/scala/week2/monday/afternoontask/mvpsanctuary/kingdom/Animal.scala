package week2.monday.afternoontask.mvpsanctuary.kingdom

abstract class Animal(
              val name: String,
              val age: Int) {

  def ageInHumanYears(factor: Int): Int = {
    factor * age
  }
  def makeSound(sound: String): String = sound
}
