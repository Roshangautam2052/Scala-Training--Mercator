package Week3.thursday.lectures

object ForCompTask extends App{
    def returnNamesInCapital(names:List[String]): List[String] ={
      val lowercasesNames = names.map(name => name.toLowerCase())
      //for(name <- names) yield name.toUpperCase()
      for(name <- names.map(x => x.toUpperCase())) yield name
    }

  def returnFirstLetterInCapital(names:List[String]): List[String] ={
    for(name <- names) yield name.substring(0,1).toUpperCase()+name.substring(1)
  }

  println(returnNamesInCapital(List("uk", "usa", "germany", "nepaL")))

  println(returnFirstLetterInCapital(List("uk", "usa", "germany", "nepal")))
}
