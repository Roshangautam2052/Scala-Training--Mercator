/**
 * Traits
 *
 */
// without defaults

trait CandyFloss{
  val hasCandyFloss: Boolean
}

class BirminghamPark(val hasRollerCoaster: Boolean, val numberOfCanteen: Int)

object WestBromichPark extends BirminghamPark(hasRollerCoaster = true, numberOfCanteen = 16) with CandyFloss{

  override val hasCandyFloss: Boolean = true
}
/*
 Sealed keyword
 */
// Only access in the same file, safety with the same file

sealed abstract class AbstractClassThatIsSealed
sealed trait SealedTrait
// Allows for exhaustive matching(to be continued...)
