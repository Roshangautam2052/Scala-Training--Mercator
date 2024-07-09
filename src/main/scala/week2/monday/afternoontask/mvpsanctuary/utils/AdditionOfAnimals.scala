package week2.monday.afternoontask.mvpsanctuary.utils

import week2.monday.afternoontask.mvpsanctuary.animalspecies.{DragonFly, Owl, Warthog}

import scala.collection.mutable.ListBuffer

class AdditionOfAnimals {
  val warthogList: ListBuffer[Warthog] = ListBuffer()
  val owlList: ListBuffer[Owl] = ListBuffer()
  val dragonFlyList: ListBuffer[DragonFly] = ListBuffer()

  def addWarthog(warthog: Warthog):String = {
      warthogList+=warthog
      s"${warthog.name}, Warthog added successfully!!"
  }

  def addOwl(owl: Owl):String = {
     owlList+= owl
      s"${owl.name}, Owl added successfully!!"
  }
  def addDragonFly(dragonFly: DragonFly):String = {
      dragonFlyList+=dragonFly
      s"${dragonFly.name}, DragonFly  added successfully!!"
  }


}
