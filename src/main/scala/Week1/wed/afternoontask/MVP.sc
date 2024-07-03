/*
MVP Task
John from primary school maths is trying to buy as many watermelons as possible and we need to give him a reality check.
John can reasonably carry 3 watermelons without a bag, and 5 with one bag.
1. Create a value to store a number of watermelons
2. Use an if statement to print out appropriate messages based on the criteria above to tell John whether he:
a) Doesn't need a bag
b) Needs a bag
c) Can't carry them
3. Use string interpolation to add to each message the number of watermelons John is trying to buy - which type of string interpolation is most appropriate here?
4. Create a value to store a boolean that indicates whether John has a bag with him or not.
5. Use an if statement and this boolean value to tell John whether he can or cannot by the desired number of watermelons in Task 1.
Can this be done without using "else if"?
6. The store puts their prices in a foreign currency, so the conversion rate to £ means one watermelon is £1.397. Calculate and use string interpolation to display the total cost of John's purchase to 2 decimal places - which type is most appropriate here?
 */
val numberOfWaterMelons: Int = 2
val hasBag: Boolean = false

// Condition to evaluate John can buy or carry watermelons or not
if (numberOfWaterMelons > 0) {
  if (numberOfWaterMelons <= 5) {
    if ( numberOfWaterMelons <= 3) {
      println(s"You can buy $numberOfWaterMelons watermelons.")
      println(s"You don't need a bag.")
      println(f"Your total price for watermelon is ${numberOfWaterMelons * 1.397}%.2f£.")
    }
    else {
      if (hasBag) {
        println(s"You can buy $numberOfWaterMelons watermelons.")
        println(f"Your total price for watermelon is ${numberOfWaterMelons * 1.397}%.2f£.")
      }
      else {
        println(s"You cannot buy the $numberOfWaterMelons watermelons.")
        println(s"You will need a bag.")
      }

    }
  }
  else {
    println(s"You cannot carry $numberOfWaterMelons watermelons on your own!!")
  }

}
else {
  println(s"$numberOfWaterMelons is an invalid input!!!")
}

