/*
1. a) Make a List of the numbers from 1-5, and a Seq of the primary colours.
b) Multiply all the values in your List by 3.
c) Remove "Blue" from your Seq.
d) Returns 'true' if your Seq contains "Orange"
 */
val numbers: List[Int] = List(1, 2, 3, 4, 5)
val primaryColors: Seq[String] = Seq("Red", "Blue", "Yellow", "Green")

//b.Multiply all values in the list by 3
val multipliedNumbers: List[Int] = numbers.map{
  number => number * 3
}
println(s"The multiplied Numbers are $multipliedNumbers.")

//c. Remove "Blue" from the Sequence
val removedBlueColorSequence: Seq[String] = primaryColors.filter{
  colors => colors != "Blue"
}

println(s"The new sequence of colors after removing Blue is $removedBlueColorSequence.")

//d.Finding Boolean value which contains Orange or not
val containsOrange: Boolean = primaryColors.contains("Orange")
if (containsOrange) println("The sequence contains orange.")
else println("The sequence does not contain orange.")

//2.Go through each value in your List of numbers and return
// true if they are odd and false if they are even.
numbers.foreach(num => println(num % 2 != 0))

//3. David has a lot of pets.
// Decide what pets he has (must include at least 1 dog) and write these in a Map.
//val map1: Map[String, Int] = Map(
//  "one" -> 1,
//  "two" -> 2,
//  "three" -> 3
//)
val dogNames: List[String] = List("Oliver", "Poppy", "Tommy", "Molly")
val catNames:List[String] = List("Whisker", "Luna", "Shadow", "Bella")
val davidPets: Map[String, List[String]] = Map(
    "cat" -> catNames,
    "dog" -> dogNames
)
//4.printing out the names of dogs of david
val davidDogNames: List[String] = davidPets("dog")
println("David's dog names are:" + davidDogNames.mkString(" , ") )


