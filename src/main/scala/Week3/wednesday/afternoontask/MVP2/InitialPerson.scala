package Week3.wednesday.afternoontask.MVP2

import Week3.wednesday.afternoontask.MVP1.countrytrait.Countries

import java.time.LocalDate

abstract class InitialPerson(val fullName: String,
                             val dateOfBirth: LocalDate,
                             val lastCountryLived: String) {
  val occupation: Option[OccupationEnum]
  val dateOfDeath: Option[LocalDate]
}

