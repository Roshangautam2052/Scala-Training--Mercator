// 1. The different other available method in case classes are:
case class House(price:Int, size:String,  location:String, availability: String, totalSqft: Double)

val smithsHouse: House = House.apply(price = 390000, size = "3 BHK", location = "Dudley, West Midlands", availability = "Available Immediately", totalSqft = 2600)
val thacherHouse: House = House(price = 250000, size = "2 BHK", location = "Burton, Staffordshire", availability = "Let Agreed", totalSqft = 3300)

//Hash Code method
/*
The hashCode method in a case class in Scala is automatically generated and provides a hash code for the instance of the case class. This hash code is used in hash-based collections like HashMap, HashSet, and others. The automatically generated hashCode method ensures that instances of the case class that are equal (as determined by the equals method) will have the same hash code.
 */
smithsHouse.hashCode()
thacherHouse.hashCode()

//.getClass
/*
In Scala, the .getClass method can be used on any instance of a case class to retrieve information about its runtime class. This is useful for reflection, type comparisons, and debugging purposes. Here’s how you can use the .getClass method with a case class:

Used to retrieve run time information of an object.
When used with case classes, it allows to perform runtime type checks, comparisons
and obtain class metadata, which can be useful for reflection and debugging.
 */
smithsHouse.getClass
thacherHouse.getClass

// .eq method
/*
 It is useful when we need to make sure that two references point to the exact same object
 while == is more commonly used to compare the contents of objects
 */
smithsHouse.eq(thacherHouse)

// .productArity
/*
 This is a member of product trait and which is automatically extended by case classes, it returns
 the number of elements in the case class or it tell the arity or the number of components that makes up the product type
 */
thacherHouse.productArity

//.productElementNames
/*
  THis method in Scala is used to get an iterator over the names of the elements (fields) in a case class. This method is part of the Product trait, which is automatically extended by case classes. It is particularly useful when you need to dynamically inspect the names of the fields of a case class, for example,
 */
val elementNames = smithsHouse.productElementNames
elementNames.foreach(println)

//. It is used to access the element of a case class by index
smithsHouse.productElement(0)

/*
Difference between the case class to perform structural equality
based on fields
Overriding Behavior:
== is automatically overridden by the case class to perform structural equality based on fields.
.equals is also automatically overridden in case classes to perform structural equality.

Null Safety:
== is null-safe. It checks for null references and handles them gracefully.
.equals is not null-safe. If you call .equals on a null reference, it will throw a NullPointerException.
Consistency:

In the context of case classes, == and .equals are consistent because both are overridden to check for structural equality.
 */