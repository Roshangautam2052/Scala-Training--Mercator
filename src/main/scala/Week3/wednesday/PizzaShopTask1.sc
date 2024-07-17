def returnPizzaType(topping:String): String ={
  topping.toLowerCase() match {
    case "spicy" => "American Hot"
    case "pepperoni " => "Pepperoni pizza"
    case  "mushroom" => "Chingale"
    case "buratta" => "Buffalo Morzarella "
    case _  => "Not available"
  }
}
println(returnPizzaType("spicy"))