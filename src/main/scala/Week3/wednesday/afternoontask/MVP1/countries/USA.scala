package Week3.wednesday.afternoontask.MVP1.countries

import Week3.wednesday.afternoontask.MVP1.countrytrait.Countries

object USA extends Countries{
  override val name: String = "USA"
  override val capital: Option[String] = Some("Washington DC")
}
