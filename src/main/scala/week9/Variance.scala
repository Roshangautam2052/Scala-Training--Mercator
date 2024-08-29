package week9

import scala.Console.println

object Variance extends App{
  /**
   * Covariance [+T]
   */
   abstract class Coffee {
    def name:String

  }
  //Sub-classes of Coffee
  case class Standard (name:String) extends Coffee
  case class FancyCoffee(name:String)extends Coffee

  def coffeeMenu(coffees:List[Coffee]):String  ={
    coffees.foreach {
      coffee => println(coffee.name)
    }.toString
  }

  val standardCoffeeMenu:List[Standard] = List(Standard("Latte"), Standard("Americano"), Standard("Cappuccino"))
  val fancyCoffeeMenu:List[FancyCoffee] = List(FancyCoffee("Mocha"), FancyCoffee("Chai"), FancyCoffee("Iced"))

  // We should be able to pass standardCoffeeMenu and fancyCoffeeMenu inside the list

  println("Standard Coffee menu:") + coffeeMenu(standardCoffeeMenu)
  println("Standard Coffee menu:") + coffeeMenu(fancyCoffeeMenu)

  /**
   * Contravariance [-T]
   */
  abstract class SummerActivity[-T] {
    def printValue(value:T): String
  }
  //  SuperClass
  abstract class Festival {
    def name:String
  }

  // sub-classes of Festival
  case class MusicFestival(name:String) extends Festival

  // sub-class of SummerActivity

 class Glastonbury extends SummerActivity[Festival] {
    override def printValue(festival: Festival): String = festival.name
  }

  class Reading extends SummerActivity[MusicFestival] {
    override def printValue(musicFestival: MusicFestival): String = musicFestival.name
  } // t  his class can only handle MusicFestival. This class is more specific but Glastonbury class

  val newMusicFestival:MusicFestival = MusicFestival("New Music Festival")

  def printNewFestival(summerActivity: SummerActivity[MusicFestival]):String  ={
    summerActivity.printValue(newMusicFestival)
  }

  val festival1: SummerActivity[Festival] = new Glastonbury // Valid
  val festival2: SummerActivity[MusicFestival] = new Glastonbury // Valid . Glastonbury has type SummerActivity[Festival] and due to
  // contravariance , its compatible with teh sub-type SummerActivity[MusicFestival]

  //val festival3:SummerActivity[Festival] = new Reading // This is reading has type of SummerActivity of type Music Festival which is the subtype of SummerActivity[Festival]
  // I cannot pass a sub-type in where a super-type is expected

  val festival4: SummerActivity[MusicFestival] = new Reading
  println(printNewFestival(festival1))
  println(printNewFestival(festival2))
  println(printNewFestival(festival4))

  /**
   * Invariance [T]
   */

  class  Box[T](var contentOfBox: T) // This is a generic class that holds a value of Type T in its contentOfBox parameter.

  abstract class Fruit {
    def variety: String
  }

  case class Apple(variety:String) extends Fruit
  case class Orange(variety:String) extends Fruit
  //Note: Apple and Oranges are sub-types of Fruit .

  val appleBox: Box[Apple] = new Box[Apple](Apple("Gala"))
  val fruitBox: Box[Orange] = new Box[Orange](Orange("small"))



}
