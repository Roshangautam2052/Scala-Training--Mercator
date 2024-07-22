package week4.afternoontask.mvp

import scala.annotation.tailrec

sealed trait Team {
  val name: String
}

object Team {
  case object Germany extends Team {
    override val name: String = "Germany"
  }

  case object Albania extends Team {
    override val name: String = "Albania"
  }

  case object Austria extends Team {
    override val name: String = "Austria"
  }

  case object Belgium extends Team {
    override val name: String = "Belgium"
  }

  case object Croatia extends Team {
    override val name: String = "Croatia"
  }

  case object CzechRepublic extends Team {
    override val name: String = "Czech Republic"
  }

  case object Denmark extends Team {
    override val name: String = "Denmark"
  }

  case object England extends Team {
    override val name: String = "England"
  }

  case object Finland extends Team {
    override val name: String = "Finland"
  }

  case object Georgia extends Team {
    override val name: String = "Georgia"
  }

  case object Hungary extends Team {
    override val name: String = "Hungary"
  }

  case object Italy extends Team {
    override val name: String = "Italy"
  }

  case object Netherlands extends Team {
    override val name: String = "Netherlands"
  }

  case object Poland extends Team {
    override val name: String = "Poland"
  }

  case object Portugal extends Team {
    override val name: String = "Portugal"
  }

  case object Romania extends Team {
    override val name: String = "Romania"
  }

  case object Scotland extends Team {
    override val name: String = "Scotland"
  }

  case object Serbia extends Team {
    override val name: String = "Serbia"
  }

  case object Slovakia extends Team {
    override val name: String = "Slovakia"
  }

  case object Spain extends Team {
    override val name: String = "Spain"
  }

  case object Switzerland extends Team {
    override val name: String = "Switzerland"
  }

  case object Turkey extends Team {
    override val name: String = "Turkey"
  }

  val listOfEuroTeamsCaseObjects: List[Team] = List(Germany, Albania, Austria, Belgium,
    Croatia, CzechRepublic, Denmark, England, Finland, Georgia, Hungary, Italy, Netherlands, Poland, Portugal,
    Romania, Scotland, Serbia, Slovakia, Spain, Switzerland, Turkey)

  def printEuroTeamsCaseObject(euroTeamsList: List[Team]): String = {
    @tailrec
    def helpPrintEuroTeamsCaseObject(euroTeamsString: List[Team], acc: String): String = {
      euroTeamsString match {
        case Nil => acc
        case ::(head, tail) =>
          val outputFormatter: String = if (acc.isEmpty) "" else "\n"
          helpPrintEuroTeamsCaseObject(euroTeamsString.tail, acc + outputFormatter + head.name)

      }

    }

    helpPrintEuroTeamsCaseObject(euroTeamsList, "")

  }

}



