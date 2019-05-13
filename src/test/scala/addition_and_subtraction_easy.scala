import java.util.Scanner

object AdditionAndSubtractionEasy {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, o, b) = sc.nextLine.split(" ")
    if (o == "+") println(a.toInt + b.toInt)
    else println(a.toInt - b.toInt)
  }
}
