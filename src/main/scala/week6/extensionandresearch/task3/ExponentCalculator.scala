package week6.extensionandresearch.task3

import scala.math.{exp, pow}

class ExponentCalculator {

  def power(exponent:Double):Int => Int = {
    base => Math.pow(base, exponent).toInt
  }

}
