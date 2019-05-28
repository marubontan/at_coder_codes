import java.util.Scanner

object APlusMinusB {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val Array(a, b, c) = sc.nextLine.split(" ").map(_.toInt)
    if (a + b == c & a - b == c) println("?")
    else if (a + b == c) println("+")
    else if (a - b == c) println("-")
    else println("!")
  }
}
