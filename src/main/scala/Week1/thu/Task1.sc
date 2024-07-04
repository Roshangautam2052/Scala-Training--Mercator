//1.
val names: Seq[String] = Seq("Tom", "Tayamul", "Antony", "Arei", "Bilal", "Jamie", "Joe", "Muhammad", "Spencer", "Roshan", "April")

//2.
val colorMap: Map[Int, String] = Map(
  1 -> "red",
  2 -> "yellow",
  3 -> "blue",
  4 -> "green"
)
// Accessing the elements of the Map
colorMap(4)
val firstColor: Map[Int, String] = colorMap.map{
  case(key, value) => (key, value + "ish")
}

// add 1 in all number in the map
val changedColorMap: Map[Int, String] = colorMap.map{
  case(key, value) => (key+1, value)
}

// remove even number from the map

val evenNumberRemovedMap: Map[Int, String] = {
  colorMap.filter(number => number._1%2!=0)
}

// Returning true is a sequence has a String that contains the letter "r"

val rExists: Boolean = names.exists{
  name => name.contains("r")
}

// Research
/*
Scala Set is a collection of pairwise different elements of the same type.
In other words, a Set is a collection that contains no duplicate elements.
There are two kinds of Sets, the immutable and the mutable.
The difference between mutable and immutable objects is that when an object is immutable, the object itself can't be changed.
By default, Scala uses the immutable Set.
If you want to use the mutable Set, you'll have to import scala.collection.mutable.Set class explicitly.
If you want to use both mutable and immutable sets in the same collection,
then you can continue to refer to the immutable Set as Set but you can refer to the mutable Set as mutable.Set.


 */

/*
In Scala, flatMap() method is identical to the map() method,
but the only difference is that in flatMap the inner grouping of an item is removed and a sequence is generated.
It can be defined as a blend of map method and flatten method.
The output obtained by running the map method followed by the flatten method is same as obtained by the flatMap().
So, we can say that flatMap first runs the map method and then the flatten method to generate the desired result.
Note:
 */
val nameSequence: Seq[String] = Seq("mercator", "group")
nameSequence.flatMap(_.toUpperCase())