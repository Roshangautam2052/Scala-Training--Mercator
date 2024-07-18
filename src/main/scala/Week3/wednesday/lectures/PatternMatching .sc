import scala.Console.println

// Match of a vals
val weather: String = "Cold"
if (weather == "cold"){
  println("Take a coat.")
}
else if (weather == "rain"){
  println("Take an umbrella.")
} else {
  println("Take nothing.")
}
//  use this for pattern matching

weather.toLowerCase() match{
  case "cold" => println("Take an umbrella.")
  case "rain" => println("Take an umbrella.")
  case _ => println(s"${weather} is not valid")
}

// Match off int

val numOfWatermelons: Int = -3

numOfWatermelons match{
  case x if  x <=0 => println("Must be more than zero")
  case 1 |2 | 3 => println("John can carry these without a bag")
  case 4 | 5 => println("John needs a bag")
  // this should be at last
  case _ => println(s"${numOfWatermelons} is invalid")

}

// if guard

// Matching of objects
//trait Temperature
sealed trait Temperature // can only be extended within the same file
object Cold extends Temperature
object Hot extends Temperature
object Mild extends Temperature


val weather: Temperature = Cold

weather match {
  case Cold => "Take a coat "
  case Hot => "Wear sun cream"
  case Mild => "Light Jacket "
  case _ => "Not valid "
}

// Matching using classes
// abstract class cannot be instantiated only can be extended
abstract class Notification

case class Email(sender: String, title: String, body:String) extends Notification
case class SMS(caller:String, message:String) extends Notification
case class VoiceRecording(contactName: String, link:String) extends Notification

val notification: Notification = SMS("Mum", "Are you home?")

notification match {
  case Email(sender, title, body) => "Email from " + sender + "title: " + title
  case SMS(caller, message) if caller == "Mum" => "Sms From. " + caller + " Don't ignore"
  case SMS(caller, message) => "Sms from. " + caller  + ":Message : " + message
  case VoiceRecording(contactName, link) => "Recording message from: " + contactName + "link: " + link
  case _ => "Not valid"
}