/**8
 *Higher order functions
 */
// what does it mean to be a first class citizen
// We can

//1. Assign functions to vals:
val addition:(Int,Int) => Int = (x,y) => x+y
addition(1,2)

val subtract : (Int, Int) => Int = (x,y) => x-y

//2. Store function in collections (eg list, maps, etc)

val functionList = List(
  (a:Int, b:Int) => a + b,
  (a:Int, b:Int) => a * b,
  (a:Int, b:Int) => a - b,
)

functionList.head(1,2)// access first function
functionList(1)(1,2) // second function in index position 1
functionList(2)(1,2) // third function


//3. pass the function into arguments/ params
def manipulateNumbers(x:Int, y:Int, function:(Int, Int) => Int): Unit = {
   function(x,y)
}

manipulateNumbers(1, 2, addition)
manipulateNumbers(1,2, subtract)

//4. Return functions from other functions
def createAdditionFunction(x: Int): Int => Int = {
  //println(s"$x")
  (y:Int) => x +y
}
createAdditionFunction(1)

val addOne:Int => Int = createAdditionFunction(1)
addOne(2)

/**
 * Functions as params
 */

def firstHOF(x:Int, function: Int => Int): Int ={
  function(x)
}

def addTwo(n:Int): Int = n + 2

firstHOF(3,addTwo)

def square(n:Int): Int = n * n

firstHOF(3, square)

def processTheList(list1:List[String], function:String => String):List[String] ={
 list1.map(function)
}

def addS(word:String):String = word + "s"
def upperCase(word:String):String = word.toUpperCase()

val newList:List[String] = List("apple", "banana", "mango", "pear")

processTheList(newList, addS)
processTheList(newList, upperCase)

// map - common HOF

val numbers = Seq(1,2,3,4,5)

// Iterating
// through and double the numbers
val doubleNumbers = numbers.map( num => num * 2)

// foldLeft - used to reduce a collection into a single value.

val foldLeftExample = numbers.foldLeft(0)(_ + _) // (_+ _)--(acc + current value)

val stringList = List("we", "love", "scala")

val concatenatedString = stringList.foldLeft("")(_ + " "+  _).trim

// foldRight

val foldRightExample = numbers.foldRight("")(_ + _)
val concatenatedStringList = stringList.foldRight("")(_ + _).trim

case class Male(male:Boolean)
case class Animal(name:String, male:Male)
val animalList = List(Animal("Fred to fox", Male(true)), Animal("Sally the Seahorse", Male(false)), Animal("Lucky the lion", Male(true)))

val foldAnimalLeft = animalList.foldLeft(List[String]()){
  (acc, animal) =>
    val sirOrMadam = animal.male match{
      case Male(true) => "Sir"
      case Male(false) => "Madam"
    }
    acc :+ s"${sirOrMadam} ${animal.name}"

}
println(foldAnimalLeft)

val foldAnimalRight = animalList.foldRight(List[String]()){
  (animal, acc) =>
    val sirOrMadam = animal.male match{
      case Male(true) => "Sir"
      case Male(false) => "Madam"
    }
    acc :+ s"${sirOrMadam} ${animal.name}"

}
println(foldAnimalRight)

/**
 * Returning Functions
 */

def smallRise(salary:Double): (Double) => Double = {
  ( salary: Double) => salary * 1.1
}
def mediumRise(salary:Double): (Double) => Double = {
  (salary: Double) => salary * 1.2
}
def largeRise(salary:Double): ( Double) => Double = {
  ( salary: Double) => salary * 1.5
}

case class Employee(name:String , salary:Double, lengthOfEmployment: Int)

def getPayRise(employee: Employee): (Double) => Double = {
  employee.lengthOfEmployment match {
    case year if year <= 3 => smallRise(employee.salary)
    case year if year <= 5 => mediumRise(employee.salary)
    case year if year > 5 =>  largeRise(employee.salary)
  }
}

val Amanda = Employee("Amanda", 30000.00, 2)
val  choosePayRise = getPayRise(Amanda)
val getNewSalary = choosePayRise(Amanda.salary)
