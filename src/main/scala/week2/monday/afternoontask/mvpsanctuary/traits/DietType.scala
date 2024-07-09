package week2.monday.afternoontask.mvpsanctuary.traits

sealed trait DietType{
  val eats: String
}


object DietType {
  object Herbivore extends DietType{
    val eats: String = "Plants"
  }


  object Carnivore extends DietType{
    val eats: String = "Meat"
  }


  object Omnivore extends DietType{
    val eats: String = "Plants and Meat"
  }


}