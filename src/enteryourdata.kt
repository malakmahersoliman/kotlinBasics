fun main() {
    print("Enter Your name: ")
    val name = readLine()!! //means "I’m sure it’s not null" (safe to use for console apps).

    print("Enter Your age: ")
    val age = readLine()!!.toInt()

    print("Enter Your city: ")
    val city = readLine()!!

    print("Enter your city code: ")
    val cityCode = readLine()!!.toInt()

    print("Enter Your Favorite Language: ")
    val FavoriteLanguage = readLine()!!


    print("Have you graduated? (yes/no): ")
    val isGraduated = readLine()!!.lowercase() == "yes"

    // println("Hello, $name! You are $age years old and live in $city!")
    print("--- Profile Summary ---")
    print("Name: $name\n") //prints text without a newline
    print("Age: $age\n")
    println("City: $city") //prints text with a newline
    println("City Code: $cityCode")
    println("Favorite Language: $FavoriteLanguage")
    println("Graduated? $isGraduated")

}