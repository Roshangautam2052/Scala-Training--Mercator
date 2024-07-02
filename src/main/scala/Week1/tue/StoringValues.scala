package Week1.tue

/**
 * 5 Melons - 50p
 * 2 apples - 10 p
 * 6 drinks - 1.20
 */
object StoringValues extends App{

  val melons = 5 * 50;
  val apples = 2 * 10;
  val drinks = 6 * (1.20*100)

  val total = melons + apples + drinks

  println("The total sales  is " + total/100 + "£")

}
