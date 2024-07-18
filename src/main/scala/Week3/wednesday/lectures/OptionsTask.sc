trait Chocolate {
  val name: String
  val filling: Option[String]

}

object FerroRocher extends Chocolate {

  override val name: String = "Ferro Rocher"
  override val filling: Option[String] = Some("Hazel Nut")
}

object DairyMilk extends Chocolate {

  override val name: String = "Dairy Milk"
  override val filling: Option[String] = Some(" chocolate truffle")
}

object Snicker extends Chocolate {

  override val name: String = "Snicker"
  override val filling: Option[String] = None
}

def whatFilling(chocolate: Chocolate): String = {
  chocolate.filling match {
    case Some("Hazel Nut") => "Hazelnut cream and a whole hazelnut"
    case Some("chocolate truffle") => "melting chocolate truffle"
    case Some(x) => s"$x is not a valid input for the chocolate"
    case None => "Peanut Butter filling inside"
  }
}
println(whatFilling(FerroRocher))