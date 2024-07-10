package week2.wednesday

import org.scalatest.FlatSpec

class TwoNumbersSpec extends FlatSpec{
 val nums = new TwoNumbers(1,2)
 val difference = new TwoNumbers(6,4)
 val multiply = new TwoNumbers(12, 4)
 val divide = new TwoNumbers(10,2)
 val multipleOf = new TwoNumbers(36,4)
 "add" should "add numbers" in {
  // new instance of the class
  assert(nums.add == 3)
 }
 "subtractYFromX" should "subtract y from x " in{ // this subtractYFromX
   // new instance for the class
  assert(difference.subtractYFromX() ==2)
 }
 "multiply" should "multiply two numbers" in  {
  assert(multiply.multiply == 48)
 }
 "divideXFromY" should "divide X from Y" in {
   assert(divide.divideXFromY ==2)
 }
 "xIsAMultipleOfY" should "show x is whether a multiple of y" in {
   assert(multipleOf.xIsAMultipleOfY())
 }

}
