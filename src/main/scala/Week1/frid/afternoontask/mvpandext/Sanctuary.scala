package Week1.frid.afternoontask.mvpandext

import Week1.frid.afternoontask.mvpandext.animalspecies.{DragonFly, Owl, Warthog}
import Week1.frid.afternoontask.mvpandext.kingdom.Animal
import Week1.frid.afternoontask.mvpandext.traits.DietType

object Sanctuary {
  val londonSanctuary: List[Animal] = List(
    new Warthog(name = "Pumba",6,"Brown",true,true, DietType.Herbivore),
    new DragonFly("Buzz", 1, 6, DietType.Herbivore),
    new Owl("Silver",3,0.2, "White", 23, DietType.Omnivore)

  )

}
