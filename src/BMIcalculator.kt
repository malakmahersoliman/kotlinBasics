fun main(){
  print("Enter your weight(KG):")
  val weight = readLine()!!.toDouble()

    print("Enter your Height(m):")

  val height = readLine()!!.toDouble()

  val bmi= weight/(height*height)

  println("Your BMI: %.2f".format(bmi))
  // after Conditionals

}