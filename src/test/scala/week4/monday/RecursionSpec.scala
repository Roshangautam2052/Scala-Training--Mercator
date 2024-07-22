package week4.monday
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import week4.lectures.Recursion

class RecursionSpec extends AnyWordSpec with Matchers {
  "concatenateWords" should{
    "return the acc if n is negative" in {
      val methodCall = Recursion.concatenateWords("hello", -1, "")
      val expectedResult = ""
      methodCall shouldEqual(expectedResult)
    }
    "returns the acc if n is 0 " in {
      Recursion.concatenateWords("hello", 0, "") shouldBe  ""
    }
    "return a concatenated string of 'hello' 3 times if n is 3" in{
      Recursion.concatenateWords("hello ", 3, "") shouldEqual("hello hello hello ")
    }
    // Edge case
    "concatenate an empty string " in {
      Recursion.concatenateWords("", 3, "") shouldEqual("")
    }
    "concatenate words when  the acc isn't empty " in {
      Recursion.concatenateWords("hello ", 3, "appendMe") shouldEqual "hello hello hello appendMe"
    }
  }
}
