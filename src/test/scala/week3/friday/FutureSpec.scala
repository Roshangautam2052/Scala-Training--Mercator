package week3.friday

import Week3.friday.Futures.{addition, additionInFuture}
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.matchers.should.Matchers
import org.scalatest.time.{Millis, Seconds, Span}
import org.scalatest.wordspec.AnyWordSpec

class FutureSpec extends AnyWordSpec with Matchers with ScalaFutures {

  implicit val defaultWaitTime: PatienceConfig = PatienceConfig(timeout = Span(3, Seconds), interval = Span(500, Millis))

  "addition method " should {
    "add two ints" in {
      addition(100, 200) shouldEqual 300
    }
  }

  // Unit test the future

  "additionInTheFuture" should {
    "eventually return the current sum" in {
      whenReady(additionInFuture) {
        result => result shouldEqual 300
      }

    }

  }
}
