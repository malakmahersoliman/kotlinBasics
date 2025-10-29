fun main(){
    print("Enter a number:")
    val number = readLine()!!.toInt()
    if(number > 0) println("positive number")
    else if(number < 0) println("negative number")
    else println("zero")
}