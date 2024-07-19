package week3.afternoontask

import Week3.thursday.afternoontask.mvp.MortgageValidator.{validateCreditScore, validateDeposit, validateMortgage}
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class MortgageValidatorSpec extends AnyWordSpec with Matchers {
  "validateMortgage" should {
    "return  a Left" when {
      "salary is less than or equal to zero " in {
        val result = validateMortgage(-200, 280000)
        result shouldBe Left("Invalid input!!!")
      }
    }

    "return a left" when {
      "mortgage is less than 4 times salary" in {
        val result = validateMortgage(45000, 240000)
        result shouldBe Left("Sorry!! Your salary doesn't meet the mortgage requirement")
      }
    }

    "return a right" when {
      "mortgage is greater or equal to 4 times salary" in {
        val result = validateMortgage(60000, 230000)
        result shouldBe Right(60000)
      }
    }
  }

  "validateDeposit" should {
    "return a Left" when {
      "deposit is less than or equal to zero" in {
        val result = validateDeposit(-200, 240000)
        result shouldBe Left("Invalid Input!!!")
      }
    }
    "return a Left" when {
      "deposit is less than 10% of house price " in {
        val result = validateDeposit(20000, 280000)
        result shouldBe Left("Sorry!! Not enough Deposit")
      }
    }
    "return a  Right" when {
      "deposit is greater than equal to 10 percent purchase price" in {
        val result = validateDeposit(30000, 240000)
        result shouldBe Right(30000)
      }
    }
  }

  "validateCreditScore" should {
    "return a Left" when {
      "credit score is less than or equal to 0" in {
        val result = validateCreditScore(0)
        result shouldBe Left("Invalid Input!!!")
      }
    }
    "return a Left" when {
      "deposit is less than 10% of house price " in {
        val result = validateCreditScore(510)
        result shouldBe Left("Not enough credit score")
      }
    }
    "return a  Right" when {
      "deposit is greater than equal to 10 percent purchase price" in {
        val result = validateCreditScore(600)
        result shouldBe Right(600)
      }
    }

  }


}
