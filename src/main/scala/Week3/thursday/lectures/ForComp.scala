package Week3.thursday.lectures

object ForComp extends App {
  // This uses <- arrow it can call any thing either map

  /* Classic
   */

  def retrieveNumbers: Seq[Int] = for (numbers <- 1 to 10) yield numbers

  println(retrieveNumbers)
  // we are not using println in day to day println(retrieveNumbers)

  def squareNumbers: Seq[Int] = for (numbers <- 1 to 10) yield numbers * numbers

  println(squareNumbers)

  def ifGuardNumbers: Seq[Int] = for (numbers <- 1 to 10 if numbers % 2 == 0) yield numbers

  println(ifGuardNumbers)

  /**
   * Use with case classes
   */

  sealed trait Colour

  case object Blue extends Colour

  case object Green extends Colour

  case object Yellow extends Colour

  case class Pencil(colour: Colour, sharpened: Boolean)

  def getPencil: List[Pencil] = for {
    colour <- List(Blue, Green, Yellow)
    sharpened <- List(true, false)
  }
    yield Pencil(colour, sharpened)
  println(getPencil)

  def getTruePencil: List[Pencil] = for {
    colour <- List(Blue, Green, Yellow)
    sharpened <- List(true)
  }
  yield Pencil(colour, sharpened)
  println(getTruePencil)

}
