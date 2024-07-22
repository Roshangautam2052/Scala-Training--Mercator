package week4.monday
import week4.afternoontask.extension.FibonacciCalc
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class FibonacciCalcSpec extends AnyWordSpec with Matchers{
  "calculateFibonacciNumber" should  {
    "return 1 if n is less than 2" in {
      FibonacciCalc.calculateFibonacciNumber(1) shouldEqual 1
    }
    "return 0 if n is less than or equal to 0" in {
      FibonacciCalc.calculateFibonacciNumber(-1) shouldEqual 0
    }
    "return 21 if n is equal to 8" in {
      FibonacciCalc.calculateFibonacciNumber(8) shouldEqual 21
    }


  }

}
