/*
1. Starting with a Seq(1-9), come up with 2 filters that, when used together, will return Seq (1,2,5,7).
 */
// first filter
val number:Seq[Int] = Seq(1,2,3,4,5,6,7,8,9)
// first filter
val firstFilter : Seq[Int]= number.filter(
  num => num%3!=0
)
// second filter
val finalFilter: Seq[Int] = firstFilter.filter(
  num => num%4!=0
)
//2The head function returns the first element of a list,
// and the tail function returns everything except the first element.
// Use head and tail only to get the 3rd element of a List.

val listOfNumbers: List[Int]= List(12, 13, 14, 15, 16, 81, 20)
// get list from second element
val listFromSecondElement = listOfNumbers.tail
// get list from third element
val listFromThirdElement = listFromSecondElement.tail
// list from third element and get the head of the list
val thirdElement = listFromThirdElement.head