package Week1.tue
/*
 John went to the shop and bought 5 lemons at 30p each, 2 bags of flour at 90p and
 6 ciders  price at 2.50£. Calculate the total cost in pence.
 */
object Task2 extends App{
  val unitPriceOfLemon = 30
  val unitPriceOfFlour = 90
  val unitPriceOfCider = 2.50 *100

  //calculate the total cost in pence
  var totalCost = 5*unitPriceOfLemon + 2*unitPriceOfFlour + 6*unitPriceOfCider
  println(" The total cost  in pence is " + totalCost +"£")
}
