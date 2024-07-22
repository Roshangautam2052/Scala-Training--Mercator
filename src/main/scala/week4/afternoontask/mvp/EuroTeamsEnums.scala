package week4.afternoontask.mvp

import scala.annotation.tailrec

case class EuroTeamsEnums() extends Enumeration {
  type teamName = Value
  val Germany, Albania, Austria,
  Belgium, Croatia, Czechia, Denmark,
  England, Finland, France, Georgia,
  Hungary, Italy, Netherlands, Poland,
  Portugal, Romania, Scotland, Serbia,
  Slovakia, Slovenia, Spain, Switzerland, Turkey = Value

  val euroTeamsEnumsList: List[Value] =
    List(Germany, Albania, Austria,
      Belgium, Croatia, Czechia, Denmark,
      England, Finland, France, Georgia,
      Hungary, Italy, Netherlands, Poland,
      Portugal, Romania, Scotland, Serbia,
      Slovakia, Slovenia, Spain, Switzerland, Turkey)

}

object EuroTeamsEnums {
  def printEuroTeamsEnums(euroTeamsEnumList: List[EuroTeamsEnums#teamName]): String = {
    @tailrec
    def helpPrintEuroTeamsEnums(euroTeamsString: List[EuroTeamsEnums#teamName], acc: String): String = {
      euroTeamsString match {
        case Nil => acc
        case ::(head, tail) =>
          val outputFormatter: String = if (acc.isEmpty) "" else "\n"
          helpPrintEuroTeamsEnums(euroTeamsString.tail, acc + outputFormatter + head.toString)

      }

    }

    helpPrintEuroTeamsEnums(euroTeamsEnumList, "")

  }
}
