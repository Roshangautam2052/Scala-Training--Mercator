package week3

import Week3.thursday.afternoontask.lectures.Either.{ISOddError, isOdd}
import Week3.thursday.afternoontask.lectures.Either
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class EitherSpec extends AnyWordSpec with Matchers{
  "isOdd" should {
    "return a Right " when {
      "the number is odd" in {
        val result = isOdd(3)
        result shouldBe Right("3 is odd")
      }
      // this is the edge case
      "the number is odd and Large" in {
        val result = isOdd(1000001)
        result shouldBe Right("1000001 is odd")
      }
    }
    "return a Left" when{
      "the number is even" in {
//        val result = isOdd(4)
//        result shouldBe Left(isO)
        isOdd(4) shouldBe Left(ISOddError)
      }

    }
  }
}
