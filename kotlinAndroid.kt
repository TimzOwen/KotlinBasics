//Android development fundamentals with Kotlin from 0 to Hero

// HELLO WORLD KOTLIN
fun printHello(){
    println("Hello kotlin and welcome to world of android programming")
}
printHello() //"Hello kotlin and welcome to world of android programming"



// BASIC MATH OPERATIONS

//Addition
println(1+1) //2
//subtruction
println(5-2)
//Division
println(50/10)
//Division
println(1/2) //0
println(1.0/2.0) // 0.5

//Calling methods on the operations
val fish = 10
fish.times(6) //60
fish.div(5) //2
fish.plus(5) //15
fish.minus(3) //7

// Storing Data types
//VAL is unchangable as VAR is changable
val laptopMake = 1 //trying changing the value will throw an error "error: val cannot be reassigned"
var laptopMake2 = 5
    laptopMake2 = 20 // changable

//values and Literals
val b: Byte = 1
val i: Int = b //throws an erros as you can't assign  "error: type mismatch: inferred type is Byte but Int was expected"
val i: Int = b.toInt() //casting works

//Nullpoint exception
//Checking if var is empty or not by avoiding if else statements
var foodFish = 5
return foodFish?.dec() ?:0


//STRINGS