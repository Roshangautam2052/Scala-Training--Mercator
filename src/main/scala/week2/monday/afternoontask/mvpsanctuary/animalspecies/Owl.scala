package week2.monday.afternoontask.mvpsanctuary.animalspecies

import week2.monday.afternoontask.mvpsanctuary.animalsubclass.Bird
import week2.monday.afternoontask.mvpsanctuary.traits.{DietType, Flyable, Species}


class Owl(name: String,
          age: Int,
          beakLength: Double,
          featherColor: String,
          val hootsPerNight: Int,
          val dietType: DietType
         ) extends Bird(name, age, beakLength, featherColor) with Species with Flyable {

  override val speciesName: String = "Strigiformes"
  override val conservationStatus: Boolean = false // assuming they are not endangered
  override val avgLifeSpanRange: String = "10-20 years"
  override val numOfYoungRange: String = "1-5"
  override val canFly: Boolean = true
  override val wigSpan: Double = 30

}