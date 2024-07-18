trait Pizza {
  val size: Int
  val crust: Option[String]
}
object Personal extends Pizza{
  val size: Int = 7
  val crust: Option[String] = None
}
object smallClassic extends Pizza {
  val size: Int = 9
  val crust: Option[String] = Some("classic")
}
val pizzaOrder: Pizza = new Pizza {
  override val size: Int = 9
  override val crust: Option[String] = Some("werwerwe")
}

def whatCrust(pizza: Pizza) :String = {
  pizza.crust.getOrElse(). match {
    case Some("classic") => "classic crust"
    case Some("Italian") => "italian crust"
    case Some(x) => s"$x is not valid crust type"
    // only if the user enters blank this None will be called
    case None => "Default crust - classic"
  }
}
whatCrust(pizzaOrder)

// .get this is bad practise if the crust is empty then it will
// return null
val getCrust:String = pizzaOrder.crust.get

//.getOrElse (default to be given )

val getCrust:String = pizzaOrder.crust.getOrElse("classic")