
case class Item(price:Double)

def smallDiscount(price:Double):(Double) => Double = {
  (price:Double) => price - price * 0.2
}
def mediumDiscount(price:Double):(Double) => Double = {
  (price:Double) => price - price * 0.4
}
def largeDiscount(price:Double):(Double) => Double = {
  (price:Double) => price - price * 0.5
}

def determineDiscount(item:Item):(Double) => Double = {
  item.price match{
    case itemPrice if (itemPrice <= 20) => smallDiscount(item.price)
    case itemPrice if (itemPrice >= 20 && itemPrice<= 50) => mediumDiscount(item.price)
    case itemPrice if (itemPrice > 50) => largeDiscount(item.price)
  }
}

val bicycle:Item = Item(100)
val choseDiscount = determineDiscount(bicycle)
val getDiscountOnItem = choseDiscount(bicycle.price)

