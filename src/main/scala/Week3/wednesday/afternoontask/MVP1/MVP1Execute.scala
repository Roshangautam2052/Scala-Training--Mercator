package Week3.wednesday.afternoontask.MVP1

import Week3.wednesday.afternoontask.MVP1.utils.CapitalCityGenerator

import scala.io.StdIn.readLine

object MVP1Execute extends App {
  val userInput:String = readLine("Enter country Name: ")
  val capitalCityGenerator:CapitalCityGenerator = new CapitalCityGenerator
  println(capitalCityGenerator.returnCapitalCity(userInput))

}
