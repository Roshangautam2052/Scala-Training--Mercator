/*
 In scala abstraction is achieved using abstract class.
 We can construct the abstract class by using the abstract keyword.
 It has both abstract and non-abstract methods

 Traits: It is like interface in java with partial implementation,
 we can construct trait by using the trait keyword, it can have both abstract
 and non-abstract methods.
 Differences:
 A class can implement multiple traits which makes the design flexible,
 while a class can only inherit from one abstract class

Traits cannot have constructor parameters, abstract classes have constructor parameters.
traits are initialized before the classes they are mixed into,
 Abstract classes follow the regular initialization order of their super class
 When to use abstract class:
 when we need to pass parameters to your base type.
 when we need seamless integration with java, when working with its frameworks.
 if the base type needs to encapsulate both behavior and state which is not supposed to
 to be duplicated in multiple traits

 When to use traits:
 if we need to mix in multiple behavior or interfaces into single class,
 When we want to define reusable behavior or interfaces it can be mixed into several classes
 When defining small reusable behaviours which can be used in flexible ways.

 */

/*
Companion classes and objects are powerful feature which allows to define
both instance-level(class) and static level(object) functionality within the
same namespace. it provides a way to group related code together, offering advantages
in terms of organization , functionality and encapsulation.
Companion Class:
A companion class is a regular class that holds instance-level functionality and data.
Companion Object:
A companion object is an object (a singleton) with the same name as the class. It holds static-level functionality and data, similar to static methods and fields in Java.
Why Use Companion Classes and Objects?
Factory methods:
Static Utility Methods:
Encapsulation:
Organizational Clarity:
Groves code organization and readability.
Type Enrichment:

for example
// Companion Class
class Person(val name: String, val age: Int) {
  def greet(): String = s"Hello, my name is $name and I am $age years old."
}

// Companion Object
object Person {
  // Factory method to create a Person
  def apply(name: String, age: Int): Person = new Person(name, age)

  // Static-level utility method
  def isAdult(person: Person): Boolean = person.age >= 18
}

// Usage Example
object Main extends App {
  val person1 = Person("Alice", 30)  // Using the apply method in the companion object
  val person2 = Person("Bob", 15)

  println(person1.greet())  // Output: Hello, my name is Alice and I am 30 years old.
  println(person2.greet())  // Output: Hello, my name is Bob and I am 15 years old.
  println(Person.isAdult(person1))  // Output: true
  println(Person.isAdult(person2))  // Output: false
}

  */