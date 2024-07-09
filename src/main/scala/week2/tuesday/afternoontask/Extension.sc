//1.
case class House(price:Int, size:String,  location:String, availability: String, totalSqft: Double)

val smithsHouse: House = House.apply(price = 390000, size = "3 BHK", location = "Dudley, West Midlands", availability = "Available Immediately", totalSqft = 2600)
val thacherHouse: House = House(price = 250000, size = "2 BHK", location = "Burton, Staffordshire", availability = "Let Agreed", totalSqft = 3300)
val shelbyHouse: House = House.apply(price = 400000, size = "4 BHK", location = "Lichfield,Staffordshire", availability = "Available ", totalSqft = 3000)

//Changing the parameters using .copy method
val modifiedSmithsHouse: House = smithsHouse.copy(price = 390000, size = "3 BHK", location = "Dudley, West Midlands", availability = "Maintenance", totalSqft = 2600 )
val modifiedThacherHouse: House = thacherHouse.copy(price = 255000, size = "2 BHK", location = "Burton, Staffordshire", availability = "Let Agreed", totalSqft = 3300)
val modifiedShelbyHouse: House = shelbyHouse.copy(price = 400000, size = "4 BHK", location = "Lichfield,Staffordshire", availability = "Let Agreed ", totalSqft = 3000)

// Using to String method to print the modified house objects
println(modifiedShelbyHouse.toString)
println(modifiedSmithsHouse.toString)
println(modifiedThacherHouse.toString)

//Using. equals method to test the case objects
// These all should print false as the parameters inside the objects are not equal
smithsHouse.equals(modifiedSmithsHouse)
shelbyHouse.equals(modifiedShelbyHouse)
thacherHouse.equals(modifiedThacherHouse)