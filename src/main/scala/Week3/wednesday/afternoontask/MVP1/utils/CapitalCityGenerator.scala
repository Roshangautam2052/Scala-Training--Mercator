package Week3.wednesday.afternoontask.MVP1.utils

import Week3.wednesday.afternoontask.MVP1.countries.{Australia, Nepal, USA, UnitedKindgom}
import Week3.wednesday.afternoontask.MVP1.countrytrait.Countries

class CapitalCityGenerator() {
  private val countriesList:List[Countries] = List(UnitedKindgom, Nepal, Australia, USA)

  def returnCapitalCity(countryName:String):String = {
    countriesList.find(_.name.equalsIgnoreCase(countryName.strip())) match{
      case Some(country) => country.capital.getOrElse("Capital City Not found!!!")
      case None => "Invalid input"
    }
  }

}
