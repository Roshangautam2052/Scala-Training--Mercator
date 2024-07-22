package week4.afternoontask.mvp

import scala.annotation.tailrec

object ImplementMVP extends App {
  // Task 1
  val euroTeamsEnums = EuroTeamsEnums()
  println(s"The list of Teams are: \n"+EuroTeamsEnums.printEuroTeamsEnums(euroTeamsEnums.euroTeamsEnumsList))

  // Task2
  println("****** Printing for Case Objects *********")
  val euroTeamsCaseObjects = Team
  println(s"The teams are: \n" + euroTeamsCaseObjects.printEuroTeamsCaseObject(euroTeamsCaseObjects.listOfEuroTeamsCaseObjects))


}
