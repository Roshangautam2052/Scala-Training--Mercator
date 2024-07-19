package week3

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec


// AnyWordSpec for nesting the tests cases
class ForCompSpec extends AnyWordSpec with Matchers{
  "retrieveNumbers" should{
    val expected:Seq[Int] = Seq(1,2,3,4,5,6,7,8,9,10)
    val numbers = retrieveNumbers
    "generate a sequence of numbers from 1 to 10" in{
      // if I call this method this should be expected
      numbers shouldBe expected
    }
    "contains 10 elements " in {
      numbers should have length 10
    }
    "should start with 1 and end with 10" in {
      numbers.head shouldBe 1
      retrieveNumbers.last shouldBe 10
    }
  }

}
