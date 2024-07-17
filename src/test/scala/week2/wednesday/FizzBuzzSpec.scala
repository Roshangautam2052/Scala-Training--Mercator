package week2.wednesday

import org.scalatest.FlatSpec

class FizzBuzzSpec extends FlatSpec {
  val testFizzBuzz = new FizzBuzz(3)
  "checkFizzBuzz" should "check whether the function returns " +
    "Fizz if divisible by 3 " in {

    assert(
        testFizzBuzz.checkFizzBuzz() == "Fizz"
//        testFizzBuzz.checkFizzBuzz() == "Buzz" ||
//        testFizzBuzz.checkFizzBuzz() == "FizzBuzz" ||
//        testFizzBuzz.checkFizzBuzz() == testFizzBuzz.number.toString
    )
  }
  "checkFizzBuzz" should "check whether the function returns " +
    "Buzz if it is divisible by 5 " in {
    assert(testFizzBuzz.checkFizzBuzz() == "Buzz")
  }
  "checkFizzBuzz" should "check whether the function returns " +
    "FizzBuzz if divisible by 3 and 5 " in {
    assert(testFizzBuzz.checkFizzBuzz() == "FizzBuzz")
  }
  "checkFizzBuzz" should "check whether the function returns " +
    "string representation of the number if all above conditions are not met" in {
    assert(testFizzBuzz.checkFizzBuzz() == testFizzBuzz.number.toString)
  }
}
