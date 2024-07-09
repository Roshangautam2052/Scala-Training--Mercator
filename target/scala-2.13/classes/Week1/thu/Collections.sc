import scala.+:
// Seq

val seq1: Seq[Int] = Seq(1,2,3)
val list1: List[Int] = List(1,2,3)

// Maps take two parameters which are key and value
// Key value pairs: key -> value
val map1: Map[String, Int] = Map(
  "one" -> 1,
  "two" -> 2,
  "three" -> 3
)
println(map1)

// Access data within this sequence of data
val getSeqData: Int = seq1.head
// tail will give everything but
// the first element (in the index position 0)
val getSeqTail = seq1.tail

val getListData: Int = list1(1)
val getListHead: Int = list1.head
val getListHead = list1.tail

// Maps get map data
val getMapData = map1("one")
// map is a function
val tripledSequence: Seq[Int] = seq1.map{
  number => number *3
}

val tripledList: List[Int] = list1.map{
  value => value *3
}

val tripledMap: Map[String, Int] = map1.map{
  case(key, value) => (key, value*3)
}
// change key only
val changedKey: Map[String, Int] = map1.map{
  case(key, value) => (key + "a", value)
}
// change key and value
val changedKeyAndValue: Map[String, Int] = map1.map{
  case(key, value) => (key + "hr", value +3)
}

// filter method

val filteredSequence: Seq[Int] = seq1.filter{
  number => number >1
}
val filteredList: List[Int] = list1.filter{
  number => number >1
}

filteredList== filteredSequence

// tuple is giving a two input
val filteredMap: Map[String, Int] ={
  map1.filter(number => number._2 > 1)
}

// filter not works opposite of filter logical not similar
val filterNotList: List[Int] = {
  list1.filterNot(number => number >=2)
}

// exists
// Boolean value

val listExists: Boolean = list1.exists{
  number => number > 9
}
val seqExists: Boolean = seq1.exists{
  number => number > 2
}
val mapExists: Boolean= map1.exists{
  number => number._2 >2
}

// contains is used for only one parameter
// check for 1 parameter
val containsSeq: Boolean = seq1.contains(0)
val containsList: Boolean = list1.contains(3)

val containsMap: Boolean = map1.contains("five")

// Arrays
val array1: Array[Int] = Array(1,2,3)
val plusTwo: Array[Int] = array1.map{
  // short hand
  _+2
}

var x = Seq[Int]()
x+:= 4
x+:= 6
println(x)

val y = Seq(3, 4,5)
// Append 6 in the sequence
val z= y:+6
// prepend 2 in the sequence
val k = 2+:z
// for more than one sequence
val m = y ++ Seq(6,7)

val w = Seq(1, 2) ++ z