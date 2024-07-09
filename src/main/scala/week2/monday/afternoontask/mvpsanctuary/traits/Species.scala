package week2.monday.afternoontask.mvpsanctuary.traits

trait Species {
  val speciesName: String
  val conservationStatus: Boolean
  val avgLifeSpanRange: String
  val numOfYoungRange: String

  def isAnimalEndangered(status:Boolean): String ={
    if(conservationStatus) "  Endangered"
    else if(!conservationStatus) "Not Endangered"
    else "Error Parameter"
  }
}
