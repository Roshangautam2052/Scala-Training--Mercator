package Week3.wednesday.afternoontask.MVP2

import Week3.wednesday.afternoontask.MVP1.countrytrait.Countries

import java.time.LocalDate

case class Person(override val fullName: String,
                  override val dateOfBirth: LocalDate,
                  override val lastCountryLived: String,
                  age: Int,
                  starSign: String,
                  override val occupation: Option[OccupationEnum],
                  override val dateOfDeath: Option[LocalDate]
                 )
  extends InitialPerson(fullName,
    dateOfBirth,
    lastCountryLived)