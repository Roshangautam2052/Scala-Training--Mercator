package week2.monday.afternoontask.mvpsanctuary.animalspecies

import week2.monday.afternoontask.mvpsanctuary.animalsubclass.Mammal
import week2.monday.afternoontask.mvpsanctuary.traits.{DietType, Species}


class Warthog(
               name: String,
               age: Int,
               furColor: String,
               hasTail: Boolean,
               val hasTusks: Boolean,
               val dietType: DietType
             ) extends Mammal(name, age, furColor, hasTail) with Species {

  override val speciesName: String = "Phacochoerus africanus"
  override val conservationStatus: Boolean = false // Assuming they are not endangered
  override val avgLifeSpanRange: String = "10-15 years"
  override val numOfYoungRange: String = "1-4"
}
