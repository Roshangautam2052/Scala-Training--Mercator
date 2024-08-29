package week9.mvp

trait FoodType {
  def foodType:String
}

case class Herbivore(foodType: String) extends FoodType
case class Omnivore(foodType: String) extends FoodType
case class Carnivore(foodType: String) extends FoodType




