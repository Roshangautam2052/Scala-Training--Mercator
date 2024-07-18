object Countries extends Enumeration{
  val  UnitedKingdom, Germany, Nepal, USA, Pakistan, Australia = Value
}
Countries.values

sealed trait countries

case object UnitedKingdom extends countries
case object Germany extends countries
case object Nepal extends countries
case object USA extends countries
case object Pakistan extends countries
case object Australia extends countries

def printCountries(countryName: countries):String ={
  countryName match {
    case UnitedKingdom => "UK"
    case Germany => "Germany"
    case Nepal => "Nepal"
    case USA => "USA"
    case Pakistan => "Pakistan"
    case Australia => "Australia"
  }
}
println(printCountries(UnitedKingdom))
