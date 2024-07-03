val weather: String = "cold"
val season: String = "winter"

//if(weather == "cold" && season == "winter"){
//  println(s"It is $weather" + "! Take a coat.")
//}
//else{
//  println("Don't take a coat.!!")
//}

if (weather == "cold"){
  println("Take a coat.")
}
else if (weather == "rain"){
  println("Take an umbrella.")
} else {
  println("Take nothing.")
}