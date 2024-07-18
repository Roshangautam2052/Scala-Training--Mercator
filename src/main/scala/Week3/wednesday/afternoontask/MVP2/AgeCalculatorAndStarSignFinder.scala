package Week3.wednesday.afternoontask.MVP2

import java.time.{LocalDate, Month, Period}

class AgeCalculatorAndStarSignFinder {

  def ageCalculator(dateOfBirth: LocalDate): Int = {
    val currentYear: LocalDate = LocalDate.now
    val age = Period.between(dateOfBirth, currentYear).getYears
    age
  }

  def startSignFinder(dateOfBirth: LocalDate): String = {
    val birthMonth: String = dateOfBirth.getMonth.toString
    val birthDate = dateOfBirth.getDayOfMonth
    val tupleOFBirthMonthAndDate = (birthMonth, birthDate)
    tupleOFBirthMonthAndDate match {
      case ("MARCH", day) if day >= 21 => "Aries"
      case ("APRIL", day) if day <= 19 => "Aries"

      case ("APRIL", day) if day >= 20 => "Taurus"
      case ("MAY", day) if day <= 20 => "Taurus"

      case ("MAY", day) if day >= 21 => "Gemini"
      case ("JUNE", day) if day <= 20 => "Gemini"

      case ("JUNE", day) if day >= 21 => "Cancer"
      case ("JULY", day) if day <= 22 => "Cancer"

      case ("JULY", day) if day >= 21 => "Cancer"
      case ("JULY", day) if day <= 22 => "Cancer"

      case ("JULY", day) if day >= 23 => "Leo"
      case ("AUGUST", day) if day <= 22 => "Leo"

      case ("AUGUST", day) if day >= 23 => "Virgo"
      case ("SEPTEMBER", day) if day <= 22 => "Virgo"

      case ("SEPTEMBER", day) if day >= 23 => "Libra"
      case ("OCTOBER", day) if day <= 22 => "Libra"

      case ("OCTOBER", day) if day >= 23 => "Scorpio"
      case ("NOVEMBER", day) if day <= 21 => "Scorpio"

      case ("NOVEMBER", day) if day >= 22 => "Sagittarius"
      case ("DECEMBER", day) if day <= 21 => "Sagittarius"

      case ("DECEMBER", day) if day >= 22 => "Capricorn"
      case ("JANUARY", day) if day <= 19 => "Capricorn"

      case ("JANUARY", day) if day >= 20 => "Aquarius"
      case ("FEBRUARY", day) if day <= 18 => "Aquarius"

      case ("FEBRUARY", day) if day >= 19 => "Pisces"
      case ("MARCH", day) if day <= 20 => "Pisces"

      case _ => "Invalid Dates"

    }

  }


}
