package week2.monday.afternoontask.mvpsanctuary.animalspecies

import week2.monday.afternoontask.mvpsanctuary.animalsubclass.Insect
import week2.monday.afternoontask.mvpsanctuary.traits.{DietType, Flyable, Species}


class DragonFly(
                 name: String,
                 age: Int,
                 numbOfLimbs: Int,
                 val dietType: DietType
               ) extends Insect(name, age, numbOfLimbs) with Species with Flyable {
  override val speciesName: String = "Odanta"
  override val conservationStatus: Boolean = false
  override val avgLifeSpanRange: String = "6 months- 2 years"
  override val numOfYoungRange: String = "upto 1000"
  override val canFly: Boolean = true
  override val wigSpan: Double = 5

}
