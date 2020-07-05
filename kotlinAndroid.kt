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


// LISTS AND OPERATION
// you cannot assign diffrent values but manipulate them on a list

val myList = mutableListOf("Tuna","Omena","Tilapia")
myList = mutableListOf("Shark") //error: val cannot be reassigned

val myList = mutableListOf("Tuna","Omena","Tilapia")
myList.remove("Tilapia") //res2: kotlin.Boolean = true

//Arrays creation
val arraySchool = arrayOf("Kabarak","Kenyatta","UoN")
println(arraySchool)

//typed arrays 
val numbersArray = intArrayOf(1,3,5,6,8,9,55)

//mixed arrays 
import java.util.*

val mixedArray = arrayOf("String",10)
println(Arrays.toString(mixedArray)) //[String, 10]

//Nesting Arrays 
val fish = 15
val plants = 12
val swarm = listOf(fish,plants)
val bigSwarm = arrayOf(swarm,arrayOf("Dolphine","whale"))
println(Arrays.toString(bigSwarm)) //[[15, 12],"Dolphine","whale"]
for (elements in swarm)println(elements) // 1512

//indexing with elements 
val fish = 15
val plants = 12
val swarm = listOf(fish,plants)
val bigSwarm = arrayOf(swarm,arrayOf("Dolphine","whale"))
for ((index,element) in swarm.withIndex())
    println("Fish at $index  is $element") //Fish at 0  is 15Fish at 1  is 12

//for in alphabets
for (i in 'b'..'g')
    println(i) //bcdefg

//ranges for numbers
for (i in 1..10)
    println(i) //12345678910

//range going down
for (i in 5 downTo 1)
    println(i) //54321

//ranges in steps
for (i in 2..8 step 2)
    println(i) //2468


//UPNEXT ON FUNCTIONS


// functions are group of related code statement that perform some specific tasks
//are of two types : The STANDARD LIBRARY and USER DEFINE FUNCTIONS

//create a funciton
fun createME()
{
    //this a function with node code
}

//calling a function 
fun callMe()
{
    //I have been called in the code below
}

callMe()

//combine creation and calling a function
fun callMe() {
    println("Printing from callMe() function.")
    println("This is cool (still printing from inside).")
}

fun main(args: Array<String>) {
    callMe()
    println("Printing outside from callMe() function.")
}

//ex2
fun main(args: Array<String>) {

    var number = 5.5
    print("Result = ${Math.sqrt(number)}")
}

//ex 3 addition funciton
fun addNumbers(n1: Double, n2: Double): Int {
    val sum = n1 + n2
    val sumInteger = sum.toInt()
    return sumInteger
}

fun main(args: Array<String>) {
    val number1 = 12.2
    val number2 = 3.4
    val result: Int

    result = addNumbers(number1, number2)
    println("result = $result")
}


