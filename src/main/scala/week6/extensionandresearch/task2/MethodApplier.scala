package week6.extensionandresearch.task2

object MethodApplier extends App{
   val utilityMethods = new UtilityMethods
  def applyFunc(number:Int, func:(Int) => Int): Int = {
    func(number)
  }
  val result1 = applyFunc(5, utilityMethods.double)
  val result2 = applyFunc(result1, utilityMethods.square)
  println(result2)

}
