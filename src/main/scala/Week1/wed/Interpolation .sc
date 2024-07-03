// s interpolation

val name: String = "Roshan"
println(s"My name is $name")

println(s"3*3 =${3*3}")

val number: Int = 7
println(s"$number * $number = ${number* number}")

//f
// %f- floating point number
// %d - decimal
// %i - int


val pi : Double = 3.1415674567798
println(f"Pi to 2dp is $pi%.2f")
println(f"Pi to 4dp is $pi%.4f")
println(f"Pi to 2dp but with 16 width is  $pi%16.4f")

printf("hello \nworld")

printf("'%s", "Hello")
printf("'%s", name)
printf("'%16s", name)
// for spacing backwards
printf("'%-16s'", name)


// Raw interpolation
println(raw"hello \nworld")