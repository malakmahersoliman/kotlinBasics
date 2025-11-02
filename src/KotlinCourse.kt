// one of the main different between kotlin and java that the types are non-null by default
// Kotlin can recognize what type the value is assigned to the variable

   val you: String? = null // so now it can be null by adding ? and still can add a value
   val you2: String? = "Human" //like here
   val me:String ="Malak" //top level variables
//   var greeting:String? = null


   /* define a variables by val or var then variable name then : type */
//functions

fun getGreeting(): String{
    return "Hello kotlin Course"
}

//unit similar to saying this returns nothing useful
fun sayHello(): Unit{
 println(getGreeting())
}

fun main(){

//
//    println("Hello Kotlin")
//    val name: String="Nate" //can't be change
//    println(me)
//     if (greeting != null){
//         println(greeting)
//     }
//    else{
//        println("Hi")
//     }
//    // when == switch in java
//    when(greeting){
//        null -> println("Hi")
//        else -> println(greeting)
//    }

   // val greetingToPrint = if (greeting != null) greeting else "Hi"
//    greeting = "Hello"
//    val greetingToPrint = when(greeting){
//        null -> "Hi"
//        else -> greeting
//    }
//    println(greetingToPrint)
    println("Hello Word")
    println(getGreeting())

}

