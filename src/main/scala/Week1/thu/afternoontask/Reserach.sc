/*
Research:
1. What makes a Set different from a Seq?
Both Set and Seq are collections in scala, but they have different
characteristics and use cases.
Definition of set:
Set is an unordered collections of unique elements. It does not allow duplicates
and does not maintain any specific order. It is implemented by several classes such as
HashSet, TreeSet and LinkedHashSet. For example : val set: Set[Int] = Set(1,4,5,6,7)

Definition of Seq -> Sequence
Sequence is an ordered collection of elements, which allows duplicate elements and
maintains the order in which elements are added. It is implemented by different classes
such as List, Vector and ArrayBuffer. For example : val list: List[Int] = List(2,3,5,8,4,2)

Use Cases:
Sequence: For order preservation, allow duplicates we can use Seq type collections.
          For example: Working in list of shopping carts we can use Sequence to maintain the order in which the items has been added
          and also to allow duplicate items.
Set: If we need a collection of unique elements without any specific order, set is better
     For example: For storing the set of employee id of a company, we can use Set to ensure no duplicates.
*/
//What should Set(1,2) == Set(2,1,1,1) return?
val firstSet: Set[Int] = Set(1, 2)
val secondSet: Set[Int] = Set(2, 1, 1, 1)
val isEqualOrNot: Boolean = firstSet == secondSet
// This returns true because in the second set, even there are 3 ones it will be
// taken as only 1 and since order is not preserved in set, these both sets are equal as they have same elements

//2.What do you think List(3,4) == Seq(3,4) will return? Why?
val list: List[Int] = List(3, 4)
val seq: Seq[Int] = Seq(3, 4)
seq == list
// This evaluates to true because List is a subtype of Sequence
// == compares elements of collections based on their structure which is order and equality of values
// and list and seq have same elements in same order

// What about List (5,6) == Set (5,6)?
val listA: List[Int] = List(5,6)
val setA: Set[Int] = Set(5,6)

listA == setA
// This evaluates to false because they are different type of collections

