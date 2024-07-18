package Week3.wednesday.afternoontask.MVP1.countries

import Week3.wednesday.afternoontask.MVP1.countrytrait.Countries

object Australia extends Countries {
  override val name: String = "Australia"
  override val capital: Option[String] = Some("Canberra")
}
