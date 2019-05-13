import java.util.Scanner

object BetweenTwoIntegers {
  def main(args: Array[String]): Unit = {
    val sc: Scanner = new Scanner(System.in)
    val Array(a, b, c) = sc.nextLine.split(" ").map(_.toInt)
    if (c < a | c > b) println("No")
    else println("Yes")
  }
}
