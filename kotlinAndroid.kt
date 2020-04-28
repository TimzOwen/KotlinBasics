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
println("value Added Tax")
println("value" + "Added" + "Tax"+ "VAT")

val numberOfFish = 20
val numberOfPlants = 30
println("I have " + numberOfFish + " and " + numberOfPlants " all together") //using + concatination
println(" I have $numberOfFish and numberOfPlants all together") // using Dollar sign 

val numberOfFish = 20
val numberOfPlants = 30
println(" I have ${numberOfPlants + numberOfFish} fish and plants together")
// I have 50 fish and plants together


//BOOLEAN AND OPERATORS
val fish = "Fish"
val plants = "Plants"
fish == plants //Boolean False

val computer = "Laptop"
val desktop = "Dell"
computer == desktop //res20: kotlin.Boolean = false

val computer = "Laptop"
val desktop = "Dell"
computer == computer //res21: kotlin.Boolean = true

val computer = "Laptop"
val desktop = "Dell"
computer != computer //res22: kotlin.Boolean = false  (Not equal operator)


// IF ELSE STATEMENTS
val numberOfFish = 20
val numberOfPlants = 40
if(numberOfFish>numberOfPlants)
    println("Not Good Ratio")
else
    println("Aquarium needs repairs") // Aquarium need repairs

// Ranges
val fish = 80
if(fish in 1..100)
    println(fish) //80

// When for switching 
val numberOfFish = 65
when(numberOfFish){
    0 -> println("getting low")
    50 -> println("better")
    else println("prerfect")
}
