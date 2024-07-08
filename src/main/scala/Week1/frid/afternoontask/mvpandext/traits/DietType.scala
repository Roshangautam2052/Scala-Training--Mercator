package Week1.frid.afternoontask.mvpandext.traits

sealed trait DietType

object DietType {
  case object Herbivore extends DietType

  case object Carnivore extends DietType

  case object Omnivore extends DietType
}