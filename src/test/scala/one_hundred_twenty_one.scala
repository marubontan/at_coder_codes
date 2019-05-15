import java.util.Scanner

object OneHundredTwentyOne {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val number: Int = sc.nextLine.split(" ").mkString.toInt
    val root_number = math.sqrt(number).toInt
    if (math.pow(root_number, 2) == number | math.pow(root_number + 1, 2) == number) println("Yes")
    else println("No")
  }
}
